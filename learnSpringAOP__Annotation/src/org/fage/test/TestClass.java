package org.fage.test;


import org.fage.controller.UserAction;
import org.fage.dao.UserDao;
import org.fage.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	@Test
	public void testSpringSimpleType(){
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao = (UserDao) context.getBean("userDao");
		dao.add(new User());
	}
	
}
