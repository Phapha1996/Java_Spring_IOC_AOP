package org.fage.test;


import org.fage.controller.UserAction;
import org.fage.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	@Test
	public void testSpringSimpleType(){
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction = (UserAction) context.getBean("userAction");
		userAction.add();
		System.out.println(userAction.add());
	}
	
}
