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
 * Created by bamboo on 2017/5/10.
 */
public class ShiroRealm extends AuthorizingRealm {

	private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

	//一般这里都写的是servic，我省略了service的接口和实现方法直接调用的mapper
	@Autowired
	private UserService userService;

	/**
	 * 登录认证
	 *
	 * @param authenticationToken
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
			return new SimpleAuthenticationInfo(user.getUserid(), user.getPwd(), getName());
		} else {
			return null;
		}
	}
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        logger.info("验证当前Subject时获取到token为：" + token.toString());
//        //查出是否有此用户
//        UUser hasUser = uUsermapper.findByName(token.getUsername());
////        String md5Pwd = new Md5Hash("123", "lucare",2).toString();
//        if (hasUser != null) {
//            // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            List<URole> rlist = uRolemapper.findRoleByUid(hasUser.getId());//获取用户角色
//            List<UPermission> plist = uPermissionmapper.findPermissionByUid(hasUser.getId());//获取用户权限
//            List<String> roleStrlist=new ArrayList<String>();////用户的角色集合
//            List<String> perminsStrlist=new ArrayList<String>();//用户的权限集合
//            for (URole role : rlist) {
//            	roleStrlist.add(role.getName());
//            }
//            for (UPermission uPermission : plist) {
//            	perminsStrlist.add(uPermission.getName());
//			}
//            hasUser.setRoleStrlist(roleStrlist);
//            hasUser.setPerminsStrlist(perminsStrlist);
////            Session session = SecurityUtils.getSubject().getSession();
////            session.setAttribute("user", hasUser);//成功则放入session
//         // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            return new SimpleAuthenticationInfo(hasUser, hasUser.getPswd(), getName());
//        }
//        return null;
//    }

//    /**
//     * 权限认证
//     *
//     * @param principalCollection
//     * @return
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        logger.info("##################执行Shiro权限认证##################");
//        //获取当前登录输入的用户名，等价于(String) principalCollection.fromRealm(getName()).iterator().next();
////        String loginName = (String) super.getAvailablePrincipal(principalCollection);
//        UUser user = (UUser) principalCollection.getPrimaryPrincipal();
////        //到数据库查是否有此对象
////        User user = null;// 实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
////        user = userMapper.findByName(loginName);
//        if (user != null) {
//            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
//            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//            //用户的角色集合
//            info.addRoles(user.getRoleStrlist()); 
//            //用户的权限集合
//            info.addStringPermissions(user.getPerminsStrlist()); 
//
//            return info;
//        }
//        // 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
//        return null;
//    }


}
