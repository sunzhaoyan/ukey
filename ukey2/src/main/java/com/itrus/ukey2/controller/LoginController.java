package com.itrus.ukey2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itrus.ukey2.po.Resource;
import com.itrus.ukey2.service.ResourceService;
import com.itrus.ukey2.service.UserService;
import com.itrus.ukey2.util.PageUtil;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	@Autowired
	ResourceService resourceService;
	
	@RequestMapping("/login")
	public String login(com.itrus.ukey2.po.User user, Model model) {
		try {
			List<com.itrus.ukey2.po.User> userList = userService.listUser(new PageUtil());
			model.addAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login";
	}
	
	@RequestMapping("/")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String returnIndex(Model model, HttpServletRequest request) {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Object principal  = securityContext.getAuthentication().getPrincipal();
		User user = null;
		if(principal instanceof User) {
			user = (User)principal;
		} else {
			return "/";
		}
		String username = user.getUsername();
		Map<String, List<Resource>> res = new HashMap<String, List<Resource>>();
		List<Resource> parentRes = new ArrayList<Resource>();
		List<Resource> childRes = new ArrayList<Resource>();
		try {
			res = resourceService.findResourceByUserName(username);
			parentRes = res.get("parent");
			childRes = res.get("child");
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("parentRes", parentRes);
		request.setAttribute("childRes", childRes);
		return "main";
	}
}
