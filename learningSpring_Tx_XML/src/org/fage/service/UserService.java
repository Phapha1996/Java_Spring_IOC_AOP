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
	
	
	//��������ò���1
	public User loginUser(User user){
		User u = userDao.getLogin(user);
		//�������������Ƿ�ͬʱ���е�
		Log log = new Log();
		log.setMessage("�û��Ѿ���ȡ��һ������");
		logDao.add(log);
		if(u==null)
			throw new RuntimeException("�û������벻��ȷ");
		return u;
	}
	
	//��������ò���2
	public User addUser(User user){
		User u = userDao.add(user);
		Log log = new Log();
		log.setMessage("������һ����¼");
		logDao.add(log);
		if(user==null)
			throw new RuntimeException("ע��ʧ��");
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
