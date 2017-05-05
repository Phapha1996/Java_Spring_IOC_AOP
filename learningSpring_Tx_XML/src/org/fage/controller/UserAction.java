package org.fage.controller;

import javax.annotation.Resource;

import org.fage.domain.User;
import org.fage.service.UserService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("userAction")
@Scope(value="prototype")
public class UserAction extends ActionSupport{
	private UserService userService;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	@Resource(name="userService")
	@Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	public String login(){
		userService.loginUser(user);
		return "success";
	}
	
}
