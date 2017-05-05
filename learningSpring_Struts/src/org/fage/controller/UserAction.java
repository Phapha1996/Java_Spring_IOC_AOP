package org.fage.controller;

import javax.annotation.Resource;

import org.fage.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("userAction")
@Scope(value="prototype")
public class UserAction extends ActionSupport {
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String add(){
		userService.addUser();
		return "success";
	}
	
}
