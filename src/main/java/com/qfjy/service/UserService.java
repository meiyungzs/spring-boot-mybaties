package com.qfjy.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.qfjy.bean.User;

public interface UserService {
	/**
	 * 通过用户ID 查询用户基本信息
	 */
	public User selectUserById(int id);

	/**
	 * 
	 * @Title: selectAll
	 * @Description: TODO(查询所有的用户信息)
	 * @return 设定文件
	 */
	public List<User> selectAll();
	
	
	public int insert(User record);
	
	int insertSelective(User record);
}
