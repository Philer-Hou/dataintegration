package com.data.cas.server.service;

import com.data.pmodel.P_Auth;
import com.data.pmodel.P_User;
/**
 * <p>登录验证接口</P>
 * @author hourz
 * @since 2018-09-02
 */
public interface AuthService {
	
	/**
	 * 登录验证
	 * @param auth 登录信息
	 * @return 
	 */
	P_User login(P_Auth auth);
}
