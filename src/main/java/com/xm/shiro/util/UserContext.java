package com.xm.shiro.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import com.xm.model.PurSysUser;


/**
 * 功能说明：获取当前登录的用户信息
 */
public class UserContext {

    /**
     * 获取当前系统用户Id
     * @return
     */
    public static int getCurUserId(){
        
        try{
            Subject subject = SecurityUtils.getSubject();
            subject.getSession().getAttribute("curUserId");
            PurSysUser user = (PurSysUser) subject.getPrincipal();
            return user.getId();
        }catch(Exception e){
            return 0;
        }
    }
    /**
     * 设置当前用户Id
     * @param curUserId
     */
    public static void setCurUserId(String curUserId) {
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setAttribute("curUserId", curUserId);
    }

    /**
     * 设置当前token
     * @param token
     */
    public static void setToken(UsernamePasswordToken token){
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setAttribute("currentToken", token);
    }

    /**
     * 获取当前token
     * @return
     */
    public static UsernamePasswordToken getToken(){
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.getSession().getAttribute("currentToken");
            UsernamePasswordToken token = (UsernamePasswordToken)subject.getPrincipal();
            return token;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
