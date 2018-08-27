package com.xm.controller;

import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.xm.mapper.PurSysUserMapper;
import com.xm.model.PurSysUserExample;
import com.xm.shiro.util.AjaxResult;
import com.xm.shiro.util.UserContext;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xm.model.PurSysUser;

@RestController
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
    private PurSysUserMapper userMapper;

  //跳转到登录表单页面
    @RequestMapping(value = "loginTest", method = RequestMethod.GET)
    public AjaxResult login() {
        return AjaxResult.unloginResult("没有登录");
    }

    //登陆验证，这里方便url测试，正式上线需要使用POST方式提交
//     @RequestMapping(value = "login", method = RequestMethod.GET)
    public String index(PurSysUser user) {
        if (user.getLogin() != null && user.getPwd() != null) {
            UsernamePasswordToken token = new UsernamePasswordToken(user.getLogin(), user.getPwd(), "login");
            Subject currentUser = SecurityUtils.getSubject();
            logger.info("对用户[" + user.getUserid() + "]进行登录验证..验证开始");
            try {
                currentUser.login(token);
                //验证是否登录成功
                if (currentUser.isAuthenticated()) {
                    logger.info("用户[" + user.getUserid() + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                    System.out.println("用户[" + user.getUserid() + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
                    return "登录成功";
                } else {
                    token.clear();
                    System.out.println("用户[" + user.getUserid() + "]登录认证失败,重新登陆");
                    return "redirect:/login";
                }
            } catch ( UnknownAccountException uae ) {
                logger.info("对用户[" + user.getUserid() + "]进行登录验证..验证失败-username wasn't in the system");
            } catch ( IncorrectCredentialsException ice ) {
                logger.info("对用户[" + user.getUserid() + "]进行登录验证..验证失败-password didn't match");
            } catch ( LockedAccountException lae ) {
                logger.info("对用户[" + user.getUserid() + "]进行登录验证..验证失败-account is locked in the system");
            } catch ( AuthenticationException ae ) {
                logger.error(ae.getMessage());
            }
        }
        return "";
    }
    
    
    /**
     * ajax登录请求接口方式登陆
     * @param loginId
     * @param password
     * @return
     */
    @RequestMapping(value="login",method=RequestMethod.POST)
    @ResponseBody
    public AjaxResult submitLogin(String loginId, String password) {
        PurSysUser user = new PurSysUser();
        try {
//            Base64 base = new Base64();
            user.setLogin(loginId);
            user.setPwd(password);
        	UsernamePasswordToken token = new UsernamePasswordToken(loginId, password);
            SecurityUtils.getSubject().login(token);
            PurSysUserExample UserExample = new PurSysUserExample();
            UserExample.createCriteria().andLoginEqualTo(loginId);
            user = userMapper.selectByExample(UserExample).get(0);
            UserContext.setCurUserId(user.getId().toString());
            UserContext.setToken(token);
            return AjaxResult.successResult("登入成功");
        }  catch ( UnknownAccountException uae ) {
            return AjaxResult.unloginResult("登入失败,用户名不存在");
        } catch ( IncorrectCredentialsException ice ) {
            return AjaxResult.unloginResult("登入失败,密码错误");
        } catch ( LockedAccountException lae ) {
            return AjaxResult.unloginResult("登入失败,用户已锁");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.unloginResult(e.getMessage());
        }
    }

    /**
     * 登出
     * @return
     */
    @RequestMapping(value = "loginOut",method=RequestMethod.GET)
    @ResponseBody
    public AjaxResult loginOut() {
        try {
            SecurityUtils.getSubject().logout();
            return AjaxResult.successResult();
        }catch (Exception e){
            e.printStackTrace();
            return AjaxResult.errorResult(e.getMessage());
        }
    }
}
