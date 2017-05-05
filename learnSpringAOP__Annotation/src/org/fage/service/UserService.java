package org.fage.service;

import org.fage.dao.UserDao;
import org.fage.domain.User;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	private UserDao userDao;
	
	
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
