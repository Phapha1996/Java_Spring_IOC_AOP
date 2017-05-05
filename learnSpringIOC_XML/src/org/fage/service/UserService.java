package org.fage.service;

import org.fage.dao.UserDao;
import org.fage.domain.User;

public class UserService {
	private UserDao userDao;
	
	/*public UserService(){
		super();
	}
	
	public UserService(UserDao userDao){
		super();
		this.userDao=userDao;
	}*/
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user){
		userDao.add(user);
	}
	
	
	
}
