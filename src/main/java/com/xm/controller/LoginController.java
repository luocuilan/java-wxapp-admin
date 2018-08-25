package com.xm.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xm.model.PurSysUser;

@RestController
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

  //跳转到登录表单页面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    
    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("this is frame");
        return "common/frame";
    }


    @RequestMapping("/index")
    public String list(Model model) {
        System.out.println("this is index");
        return "index";
    }
    
    //登陆验证，这里方便url测试，正式上线需要使用POST方式提交
    @RequestMapping(value = "/ajaxLogin", method = RequestMethod.GET)
    public String index(PurSysUser user) {
        if (user.getUserid() != null && user.getPwd() != null) {
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
        return "login";
    }
    
    
    /**
     * ajax登录请求接口方式登陆
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value="/ajaxLogin",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> submitLogin(String username, String password) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        try {

        	UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            SecurityUtils.getSubject().login(token);
            resultMap.put("status", 200);
            resultMap.put("message", "登录成功");

        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", e.getMessage());
        }
        return resultMap;
    }
}
