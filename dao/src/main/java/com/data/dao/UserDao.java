package com.data.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.data.dao.provider.UserProvider;
import com.data.pmodel.P_User;
import com.github.pagehelper.PageInfo;

@Mapper
public interface UserDao {

	@SelectProvider(method = "list", type = UserProvider.class)
	PageInfo<P_User> list(Map<String, Object> item);
	
	@SelectProvider(method = "save", type = UserProvider.class)
	Long save(P_User user);
	
	@SelectProvider(method = "update", type = UserProvider.class)
	Long update(P_User user);
	
	@SelectProvider(method = "remove", type = UserProvider.class)
	Long remove(String ids);
}
