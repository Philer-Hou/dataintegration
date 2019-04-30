package com.data.cas.server.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.cas.server.service.UserService;
import com.data.dao.UserDao;
import com.data.pmodel.P_User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public PageInfo<P_User> list(int pagesize, int pageNum, Map<String, Object> item) {
		PageHelper.startPage(pageNum, pagesize);
		PageInfo<P_User> page = userDao.list(item);
		return page;
	}

}
