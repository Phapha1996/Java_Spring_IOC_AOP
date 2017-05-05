package org.fage.controller;


import javax.annotation.Resource;

import org.fage.domain.User;
import org.fage.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
	private UserService userService;


	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String add(){
		userService.addUser(new User());
		return "success";
	}
	
}
