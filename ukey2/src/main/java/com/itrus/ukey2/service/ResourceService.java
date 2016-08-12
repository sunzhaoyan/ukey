package com.itrus.ukey2.service;

import java.util.List;

import com.itrus.ukey2.po.Resource;

public interface ResourceService {
	public List<Resource> findResourceByUserName(String username) throws Exception;
}
