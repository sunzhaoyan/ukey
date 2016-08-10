package com.itrus.ukey2.service;

import java.util.List;

import com.itrus.ukey2.po.User;
import com.itrus.ukey2.util.PageUtil;

public interface UserService {
	public boolean addUser(User user) throws Exception;

	public boolean delUser(int id) throws Exception;

	public List<User> listUser(PageUtil pageUtil) throws Exception;
}
