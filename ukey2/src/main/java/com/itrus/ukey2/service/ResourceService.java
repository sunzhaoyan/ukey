package com.itrus.ukey2.service;

import java.util.List;
import java.util.Map;

import com.itrus.ukey2.po.Resource;

public interface ResourceService {
	public Map<String, List<Resource>> findResourceByUserName(String username) throws Exception;
}
