package com.itrus.ukey2.controller.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class LoginSuccess extends SavedRequestAwareAuthenticationSuccessHandler {
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		System.out.println("LoginSuccess.onAuthenticationSuccess");
		super.onAuthenticationSuccess(request, response, authentication);
	}
}
