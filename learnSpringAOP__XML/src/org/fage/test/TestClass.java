package org.fage.test;


import org.fage.controller.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestClass {
	@Test
	public void testSpringSimpleType(){
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction ua = (UserAction) context.getBean("userAction");
		ua.add();
	}
	
}
