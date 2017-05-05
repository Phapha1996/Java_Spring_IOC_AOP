package org.fage.service;

import javax.annotation.Resource;

import org.fage.dao.UserDao;
import org.fage.domain.User;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user){
		userDao.add(user);
//		throw new RuntimeException("‘À––“Ï≥£");
	}
	
}
