package com.xm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xm.model.SysDatabase;
import com.xm.service.sys.DataBaseService;
import com.xm.shiro.util.AjaxResult;

@RestController
public class DataBaseController {
	
	private static Logger logger = LoggerFactory.getLogger(DataBaseController.class);
	
	
	@Autowired
	private DataBaseService databaseService;

	/**
	 * 返回相应的数字字典参数类型
	 * @param dataType 参数类型
	 * @return
	 */
	@RequestMapping(value = "getDatabase", method = RequestMethod.POST)
	public AjaxResult getDatabase(String dataType){
		AjaxResult resultMap = databaseService.getDataBaseValue(dataType);
		logger.info("------------请求成功");
		return resultMap;
	}
	/**
	 * 新增参数类型
	 * @param dataType 参数类型
	 * @return
	 */
	@RequestMapping(value = "saveDatabase", method = RequestMethod.POST)
	public AjaxResult saveDatabase(SysDatabase dataBase){
		AjaxResult resultMap = databaseService.saveDataBase(dataBase);
		return resultMap;
	}
	/**
	 * 删除参数类型
	 * @param dataType 参数类型
	 * @return
	 */
	@RequestMapping(value = "delDatabase", method = RequestMethod.POST)
	public AjaxResult delDatabase(Integer baseId){
		AjaxResult resultMap = databaseService.delDataBase(baseId);
		return resultMap;
	}
}
