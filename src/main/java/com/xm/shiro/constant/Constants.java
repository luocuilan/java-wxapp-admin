package com.xm.shiro.constant;

import java.util.Date;

/**
 * 开发框架基础架构的公共常量设置类（行知网络使用此基础框架的项目均可使用此常量类）
 * @author xieyong
 *
 */
public class Constants {
	
	/**自定义配置文件*/
	public static final String ENVIRONMENT_PROPERTIES_PATH = "config.properties";
	
	/**附件上传类型（1：图片；2：视频；3：音频；4：文档；5：压缩；0：其他）*/
	public static String ATTACHMENT_TYPE_OTHER = "0";
	/**附件上传类型（1：图片；2：视频；3：音频；4：文档；5：压缩；0：其他）*/
	public static String ATTACHMENT_TYPE_IMAGE = "1";
	/**附件上传类型（1：图片；2：视频；3：音频；4：文档；5：压缩；0：其他）*/
	public static String ATTACHMENT_TYPE_VIDEO = "2";
	/**附件上传类型（1：图片；2：视频；3：音频；4：文档；5：压缩；0：其他）*/
	public static String ATTACHMENT_TYPE_AUDIO = "3";
	/** 附件上传类型（1：图片；2：视频；3：音频；4：文档；5：压缩；0：其他）*/
	public static String ATTACHMENT_TYPE_DOCUMENT = "4";
	/** 附件上传类型（1：图片；2：视频；3：音频；4：文档；5：压缩；0：其他）*/
	public static String ATTACHMENT_TYPE_RAR = "5";
	
	/**失败标识-文字*/
	public static final String FAIL_TEXT = "FAIL";
	/**成功标识-文字*/
	public static final String SUCCESS_TEXT = "SUCCESS";
	/**整个应用0表示失败*/
	public static final String FAIL="0";
	/**整个应用1表示成功*/
	public static final String SECCUESS="1";
	/**未登录*/
	public static final String NO_LOGIN = "-1";
	/**未授权*/
	public static final String NO_AUTHORITY = "-2";
	
	/**整个应用0表示否*/
	public static final int NO = 0;
	/**整个应用1表示是*/
	public static final int YES = 1;
	
	/**不删除*/
	public static final int DEL_STATE_NO = 0;
	/**已删除*/
	public static final int DEL_STATE_YES = 1;
	
	/**显示1*/
	public static final int SHOW_STATE_YES = 1;
	/**不显示0*/
	public static final int SHOW_STATE_NO = 0;
	
	//商品类型定义
	//0：全部，1：爆款，2：主食，3：家常菜,4:酒饮,5:零食,6:早餐必点,7:奶茶
	public static final String[] PRODUCT_NAME = {}; 
	
}
