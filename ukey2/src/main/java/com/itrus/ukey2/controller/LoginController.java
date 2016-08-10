package com.itrus.ukey2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itrus.ukey2.po.User;
import com.itrus.ukey2.service.UserService;
import com.itrus.ukey2.util.PageUtil;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String login(User user, Model model) {
		try {
			List<User> userList = userService.listUser(new PageUtil());
			model.addAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
}
