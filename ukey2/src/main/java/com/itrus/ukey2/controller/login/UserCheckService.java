package com.itrus.ukey2.controller.login;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserCheckService implements UserDetailsService {
	private String j_username;
	private String j_password;

	private UserCheckService() {
		System.out.println("UserCheckService instance");
	}

	@SuppressWarnings("deprecation")
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("UserDetails.loadUserByUsername");
		System.out.println(j_username + "," + j_password);
		UserDetails user = null;
		List<GrantedAuthority> roleList = new ArrayList<GrantedAuthority>();
		if (!StringUtils.isBlank(j_username) && "szy".equals(j_username)) {
			roleList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
			user = new User(j_username, j_password, true, true, true, true, roleList);
		}

		return user;
	}

	public String getJ_username() {
		return j_username;
	}

	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}

	public String getJ_password() {
		return j_password;
	}

	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}

}
