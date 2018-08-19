package com.xm.shiro.util;

import java.util.HashMap;

/**
 * ajax 返回json封装类
 * 
 * @author wangchaojie　2017年10月19日
 */
public class AjaxResult extends HashMap<String, Object> {

    private static final long serialVersionUID = -7484781490745076286L;

    /**
     *
     * 成功{success:true} 
     * @return
     */
    public static AjaxResult successResult() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("success", true);
        ajaxResult.put("code", 0);
        return ajaxResult;
    }

    /**
     *
     * 成功并加入返回信息{success:true,msg=successMsg}
     * @param successMsg
     * @return
     */
    public static AjaxResult successResult(String successMsg) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("success", true);
        ajaxResult.put("code", 0);
        ajaxResult.put("msg", successMsg);
        return ajaxResult;
    }

    /**
     *
     * 异常并返回异常信息{success:false,error=errorMsg}
     * @param errorMsg
     * @return
     */
    public static AjaxResult errorResult(String errorMsg) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("success", false);
        ajaxResult.put("code", 400);
        ajaxResult.put("error", errorMsg);
        return ajaxResult;
    }

    /**
    *
    * 异常并返回异常信息{success:false,error=errorMsg}
    * @param errorMsg
    * @return
    */
   public static AjaxResult unloginResult(String errorMsg) {
       AjaxResult ajaxResult = new AjaxResult();
       ajaxResult.put("success", false);
       ajaxResult.put("code", -4);
       ajaxResult.put("error", errorMsg);
       return ajaxResult;
   }
    /**
     *
     * 成功并返回对象信息{success:true,data:{objJson}}
     * @param obj
     * @return
     */
    public static AjaxResult objectResult(Object obj) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("success", true);
        ajaxResult.put("code", 0);
        ajaxResult.put("data", obj);
        return ajaxResult;
    }
}
