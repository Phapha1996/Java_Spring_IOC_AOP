package org.fage.dao;

import javax.annotation.Resource;

import org.fage.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User getLogin(User user){
		return (User)sessionFactory.getCurrentSession().createQuery("from User u where u.username=? and u.password=?")
		.setString(0, user.getUsername()).setString(1, user.getPassword()).uniqueResult();
		
	}
	
	public User add(User user){
		sessionFactory.getCurrentSession().save(user);
		return sessionFactory.getCurrentSession().get(User.class, user.getId());
	}
	
}
