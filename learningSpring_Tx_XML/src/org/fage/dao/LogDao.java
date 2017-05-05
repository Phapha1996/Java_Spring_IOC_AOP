package org.fage.dao;

import javax.annotation.Resource;

import org.fage.domain.Log;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LogDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void add(Log log){
		sessionFactory.getCurrentSession().save(log);
	}
	
}
