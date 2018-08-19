package com.xm.service.sys;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.xm.mapper.SysDatabaseMapper;
import com.xm.model.SysDatabase;
import com.xm.model.SysDatabaseExample;
import com.xm.model.SysDatabaseExample.Criteria;
import com.xm.shiro.util.AjaxResult;

@Service
public class DataBaseService {
	
	@Autowired
	private SysDatabaseMapper dataBaseMapper;

	public AjaxResult getDataBaseValue(String dataType) {
		SysDatabaseExample dataExample = new SysDatabaseExample();
		Criteria dataC = dataExample.createCriteria();
		dataC.andTypeEqualTo(dataType);
		dataExample.setOrderByClause("sort asc");
		List<SysDatabase> dataBaseList = dataBaseMapper.selectByExample(dataExample);
		return AjaxResult.objectResult(dataBaseList);
	}
	@Transactional
	public AjaxResult saveDataBase(SysDatabase dataBase) {
		if(StringUtils.isEmpty(dataBase.getBaseId())) {
			String code = UUID.randomUUID().toString().replaceAll("-", "");
			dataBase.setCode(code);
			dataBase.setCreateTime(new Date());
			if(StringUtils.isEmpty(dataBase.getSort())) {
				dataBase.setSort(255);
			}
			dataBaseMapper.insertSelective(dataBase);
		}else {
			dataBaseMapper.updateByPrimaryKeySelective(dataBase);
		}
		return AjaxResult.objectResult(dataBase);
	}
	@Transactional
	public AjaxResult delDataBase(Integer baseId) {
		int num = dataBaseMapper.deleteByPrimaryKey(baseId);
		return AjaxResult.successResult();
	}
}
