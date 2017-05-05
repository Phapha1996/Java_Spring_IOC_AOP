package org.fage.test;


import org.fage.controller.UserAction;
import org.fage.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	@Test
	public void testSpringBean(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction = (UserAction) context.getBean("userAction");
		System.out.println(userAction.add());
		context.destroy();
	}
	
	@Test
	public void testSpringSimpleType(){
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user  = (User) context.getBean("user1");
		User user2 = (User)context.getBean("user1");
		//À≥±„≤‚ ‘scope
//		System.out.println(user==user2);
		System.out.println(user.getId()+user.getUsername()+user.getPassword());
	
	}
	
}
