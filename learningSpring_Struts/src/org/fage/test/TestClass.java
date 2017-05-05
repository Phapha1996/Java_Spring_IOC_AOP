package org.fage.test;

import org.fage.controller.UserAction;
import org.fage.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	
	@Test
	public void testSpringUse(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction = ctx.getBean(UserAction.class, "userAction");
		userAction.add();
	}
}
