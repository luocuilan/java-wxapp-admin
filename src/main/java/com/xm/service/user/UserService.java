package com.xm.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xm.mapper.PurSysUserMapper;
import com.xm.model.PurSysUser;
import com.xm.model.PurSysUserExample;
import com.xm.model.PurSysUserExample.Criteria;

@Service
public class UserService {
	
	@Autowired
	private PurSysUserMapper sysuserMapper;
	
	/**
	 * 通过用户名查询用户权限
	 * @param userCode	用户CODE
	 * @return
	 */
	public List<String> selectUserPermissions(String userCode) {
		return sysuserMapper.selectUserPermissions(userCode);
	}
	
	/**
	 * 通过用户loginId获取有效用户
	 * @param loginId	用户loginId
	 * @return
	 */
	public PurSysUser getUserByUserCode(String loginId) {
		PurSysUserExample example = new PurSysUserExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(loginId)) {
			criteria.andLoginEqualTo(loginId.trim());
		}
		List<PurSysUser> userList = sysuserMapper.selectByExample(example);
		if(userList != null && userList.size()>0) {
			return userList.get(0);
		}else {
			return null;
		}
	}
}
