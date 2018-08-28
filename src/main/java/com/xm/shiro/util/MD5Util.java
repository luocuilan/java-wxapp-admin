package com.xm.shiro.util;

import org.apache.shiro.crypto.hash.SimpleHash;

import java.security.MessageDigest;

public class MD5Util {
	/*** 
     * MD5加码 生成32位md5码 
     */  
    public static String string2MD5(String inStr){
        String hashAlgorithmName = "MD5";//加密方式
        Object crdentials = inStr;//密码原值
        Object salt = null;//盐值
        int hashIterations = 2;//加密1024次
        Object result = new SimpleHash(hashAlgorithmName,crdentials,salt,hashIterations);
        System.out.println(result);
        return result.toString();
    }
  
    // 测试主函数  
    public static void main(String args[]) {  
        String s = new String("123456");  
        System.out.println("原始：" + s);  
        System.out.println("MD5后：" + string2MD5(s));  
    }
}
