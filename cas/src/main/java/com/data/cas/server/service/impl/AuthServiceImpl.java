package com.data.cas.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.cas.server.service.AuthService;
import com.data.common.pattern.PatternUtils;
import com.data.dao.AuthDao;
import com.data.pmodel.P_Auth;
import com.data.pmodel.P_User;

/**
 * <p>登录实现对象</p>
 * @author hourz
 * @since 2018-09-09
 */
@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	AuthDao authDao;
	
	@Override
	public P_User login(P_Auth auth) {
		P_User user = new P_User();
		// 验证邮箱
		if(PatternUtils.isEmail(auth.getLoginName())) {
			user = authDao.loginMail(auth);
		// 验证手机号
		} else if(PatternUtils.isMobile(auth.getLoginName())) {
			user = authDao.loginMobile(auth);
		// 验证登录名
		} else {
			user = authDao.loginName(auth);
		}
		return user;
	}

}
