package com.xm.shiro.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.xm.model.PurSysUser;
import com.xm.service.user.UserService;


/**
 * 获取用户的角色和权限信息
 */
public class ShiroRealm extends AuthorizingRealm {

	private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

	//一般这里都写的是servic，我省略了service的接口和实现方法直接调用的mapper
	@Autowired
	private UserService userService;

	/**
	 * 登录认证
	 *
	 * @param principals
	 * @return
	 * @throws AuthenticationException
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String)principals.getPrimaryPrincipal(); 
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		if(!StringUtils.isEmpty(userName) ) {
			@SuppressWarnings("unchecked")
			Set<String> nowPermissions = (Set<String>) SecurityUtils.getSubject().getSession().getAttribute(userName+"nowPermissions");
			if (nowPermissions != null) {
				info.setStringPermissions(nowPermissions);
			}
			else {
				List<String> permissions = userService.selectUserPermissions(userName);
				if(permissions!=null && permissions.size()>0) {
					info.addStringPermissions(permissions);
				}
				Session session = SecurityUtils.getSubject().getSession();
				session.setAttribute(userName+"nowPermissions", info.getStringPermissions());
			}
			return info;
		} else {
			return null;
		}
	}
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		String userName = (String)authcToken.getPrincipal();
		PurSysUser user = userService.getUserByUserCode(userName);
		if(user != null) {
			return new SimpleAuthenticationInfo(user.getLogin(), user.getPwd(), getName());
		} else {
			return null;
		}
	}
}
