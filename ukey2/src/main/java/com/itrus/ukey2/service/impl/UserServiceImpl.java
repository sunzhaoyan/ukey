package com.itrus.ukey2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itrus.ukey2.mapper.UserMapper;
import com.itrus.ukey2.po.User;
import com.itrus.ukey2.po.UserExample;
import com.itrus.ukey2.service.UserService;
import com.itrus.ukey2.util.PageUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	public boolean addUser(User user) throws Exception {

		return false;
	}

	public boolean delUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> listUser(PageUtil pageUtil) throws Exception {
		List<User> userList = new ArrayList<User>();
		UserExample example = new UserExample();
		userList = userMapper.selectByExample(example);
		return userList;
	}

	@Override
	public User findUserByExample(UserExample userExample) throws Exception {
		List<User> users = userMapper.selectByExample(userExample);
		if (users != null && users.size() > 0) {
			return users.get(0);
		}
		return new User();
	}

}
