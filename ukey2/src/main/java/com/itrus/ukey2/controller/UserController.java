package com.itrus.ukey2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itrus.ukey2.po.User;
import com.itrus.ukey2.service.UserService;
import com.itrus.ukey2.util.PageUtil;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(produces="text/html")
	public  String listUser(PageUtil pageUtil, Model model) {
		List<User> userList = new ArrayList<User>();
		try {
			userList = userService.listUser(pageUtil);
			model.addAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list";
	}
}
