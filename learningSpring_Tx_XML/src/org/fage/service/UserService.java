package org.fage.service;

import javax.annotation.Resource;

import org.fage.dao.LogDao;
import org.fage.dao.UserDao;
import org.fage.domain.Log;
import org.fage.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserService {
	private UserDao userDao;
	private LogDao logDao;
	
	
	//事务的配置测试1
	public User loginUser(User user){
		User u = userDao.getLogin(user);
		//用来测试事务是否同时进行的
		Log log = new Log();
		log.setMessage("用户已经读取了一条数据");
		logDao.add(log);
		if(u==null)
			throw new RuntimeException("用户名密码不正确");
		return u;
	}
	
	//事务的配置测试2
	public User addUser(User user){
		User u = userDao.add(user);
		Log log = new Log();
		log.setMessage("增加了一条记录");
		logDao.add(log);
		if(user==null)
			throw new RuntimeException("注册失败");
		return u;
	}
	
	
	
	
	public LogDao getLogDao() {
		return logDao;
	}
	@Resource
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
