package org.fage.controller;

import javax.annotation.Resource;

import org.fage.domain.User;
import org.fage.service.UserService;
import org.springframework.stereotype.Controller;

@Controller("userAction")
//@Scope("singleton")
public class UserAction {
	private UserService service;
	public UserService getService() {
		return service;
	}
	
	@Resource(name="userService")
	public void setService(UserService service) {
		this.service = service;
	}



	public String add(){
		service.addUser(new User());
		return "success";
	}
	
}
