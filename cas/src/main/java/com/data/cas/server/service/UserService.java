package com.data.cas.server.service;

import java.util.Map;

import com.data.pmodel.P_User;
import com.github.pagehelper.PageInfo;
/**
 * <p>用户接口</p>
 * @author hourz
 * @since 2018-09-14
 */
public interface UserService {

	PageInfo<P_User> list(int pagesize, int pageNum, Map<String, Object> item);

}
