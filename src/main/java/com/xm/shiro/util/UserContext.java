package com.xm.shiro.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.xm.model.PurSysUser;


/**
 * 功能说明：获取当前登录的用户信息
 */
public class UserContext {
    
    /**
     * 获取当前系统用户信息
     * @return
     */
    public static PurSysUser getCurUser(){
        try{
            Subject subject = SecurityUtils.getSubject();
            subject.getSession().getAttribute("curUser");
            PurSysUser user = (PurSysUser) subject.getPrincipal();
            return user;
        }catch(Exception e){
            return null;
        }
    }
    
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
     * 设置当前用户name
     * @param curUserName
     */
    public static void setCurUserName(String curUserName) {
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setAttribute("curUserName", curUserName);
    }
}
