package com.itrus.ukey2.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itrus.ukey2.mapper.ResourceMapper;
import com.itrus.ukey2.po.Resource;
import com.itrus.ukey2.po.ResourceExample;
import com.itrus.ukey2.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	ResourceMapper resourceMapper;
	@Override
	public Map<String, List<Resource>> findResourceByUserName(String username) throws Exception {
		List<Resource> childRes = resourceMapper.findResourceByUserName(username);
		List<Resource> parentRes = new ArrayList<Resource>();
		List<String> parentCode = new ArrayList<String>();
		for (Resource res : childRes) {
			parentCode.add(res.getParentResCode());
		}
		parentRes = resourceMapper.selectByBatchParentResCode(parentCode);
		Map<String, List<Resource>> retMap = new HashMap<String, List<Resource>>();
		retMap.put("parent", parentRes);
		retMap.put("child", childRes);
		return retMap;
	}

}
