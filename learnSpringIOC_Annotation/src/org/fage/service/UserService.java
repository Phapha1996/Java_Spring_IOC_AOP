package org.fage.service;

import javax.annotation.Resource;

import org.fage.dao.UserDao;
import org.fage.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userService")
//@Scope("singleton")
public class UserService {
//	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
//	@Autowired
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user){
		userDao.add(user);
	}
	
	
	
}
