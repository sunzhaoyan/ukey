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
	public List<Resource> findResourceByUserName(String username) throws Exception {
		List<Resource> childRes = resourceMapper.findResourceByUserName(username);
		List<Resource> parRes = new ArrayList<Resource>();
		ResourceExample example = new ResourceExample();
		ResourceExample.Criteria criteria = example.or();
		Map<String, Integer> parMap = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		for (Resource res : childRes) {
			if(!parMap.containsKey(res.getParentResCode())){
				list.add(res.getParentResCode());
			}
		}
		parRes = resourceMapper.selectByBatchParentResCode(list);
		return parRes;
	}

}
