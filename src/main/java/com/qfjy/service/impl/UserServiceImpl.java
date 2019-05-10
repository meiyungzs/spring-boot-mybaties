package com.qfjy.service.impl;

import com.qfjy.bean.User;
import com.qfjy.mapper.UserMapper;
import com.qfjy.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 通过用户ID 查询用户基本信息
     *
     * @param id
     */
    @Override
    public User selectUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}
	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}
	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}
}
