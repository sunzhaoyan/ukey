package com.itrus.ukey2.controller.login;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.itrus.ukey2.po.UserExample;
import com.itrus.ukey2.po.UserExample.Criteria;
import com.itrus.ukey2.service.UserService;

@SuppressWarnings("deprecation")
@Service
public class UserCheckService implements UserDetailsService {

	@Autowired
	UserService userService;
//	@Autowired
//	PasswordEncoder passwordEncoder;
	
	private UserCheckService() {
		System.out.println("UserCheckService instance");
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("UserDetails.loadUserByUsername");
		UserDetails userDetails = null;
		if (!StringUtils.isBlank(username) && "szy".equals(username)) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.or();
		criteria.andUserNameEqualTo(username);
		com.itrus.ukey2.po.User user = null;
		try {
			user = userService.findUserByExample(userExample);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String password = "";
		if (user != null) {
			password = user.getPassword();
//			password = passwordEncoder.encodePassword(password, username);
		}
		List<GrantedAuthority> roleList = new ArrayList<GrantedAuthority>();
			roleList.add(new GrantedAuthorityImpl("ROLE_USER"));
			userDetails = new User(username, password, true, true, true, true, roleList);
		}

		return userDetails;
	}


}
