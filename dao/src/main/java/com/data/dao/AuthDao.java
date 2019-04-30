package com.data.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.data.dao.provider.AuthProvider;
import com.data.pmodel.P_Auth;
import com.data.pmodel.P_User;

/**
 * <p>登录验证</p>
 * @author hourz
 * @since 2018-09-10
 */
@Mapper
public interface AuthDao {

	/**
	 * 根据邮箱获取用户信息
	 * @param auth 权限
	 * @return 用户信息
	 */
	@SelectProvider(method = "email", type = AuthProvider.class)
	P_User loginMail(P_Auth auth);
	
	/**
	 * 根据手机号获取用户信息
	 * @param auth 权限
	 * @return 用户信息
	 */
	@SelectProvider(method = "mobile", type = AuthProvider.class)
	P_User loginMobile(P_Auth auth);
	
	/**
	 * 根据登录名获取用户信息
	 * @param auth 权限
	 * @return 用户信息
	 */
	@SelectProvider(method = "name", type = AuthProvider.class)
	P_User loginName(P_Auth auth);
	
}
