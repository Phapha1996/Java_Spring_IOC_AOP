package org.fage.service;

import javax.annotation.Resource;

import org.fage.dao.UserDao;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Required
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(){
		userDao.add();
	}
	
	
}
