package com.itrus.ukey2.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

public class LoginFilter extends AbstractAuthenticationProcessingFilter {


	protected LoginFilter() {
		super("/j_spring_security_check");
		System.out.println("LoginFilter instance");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		
		String username = request.getParameter("j_username");
		String password =  request.getParameter("j_password");
		System.out.println("LoginFilter.attemptAuthentication");
		System.out.println(username + "," + password);
		return null;
	}


}
