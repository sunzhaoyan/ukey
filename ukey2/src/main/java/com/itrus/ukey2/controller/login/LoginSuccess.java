package com.itrus.ukey2.controller.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import com.itrus.ukey2.po.Resource;
import com.itrus.ukey2.service.ResourceService;

public class LoginSuccess extends SavedRequestAwareAuthenticationSuccessHandler {
	
	@Autowired
	ResourceService resourceService;
	
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		System.out.println("LoginSuccess.onAuthenticationSuccess");
		String username = authentication.getName();
		List<Resource> res = new ArrayList<Resource>();
		try {
			res = resourceService.findResourceByUserName(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("", res);
		super.setDefaultTargetUrl("/index");
		super.onAuthenticationSuccess(request, response, authentication);
	}
}
