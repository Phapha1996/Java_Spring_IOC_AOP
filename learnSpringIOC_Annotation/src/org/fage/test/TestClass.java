package org.fage.test;

import javax.annotation.Resource;

import org.fage.controller.UserAction;
import org.fage.domain.User;
import org.fage.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/*
 *1. Ĭ�ϵ�scope�ǵ���singleton��prototype��ÿ��new
 *2. @ResourceĬ�ϰ����֣�@AutoAwreĬ�ϰ�����
 *3. @component��@controller��@Service�ȵȣ�����࣬ע��Ҫ��spring���������Ӱ�ɨ��
 */


public class TestClass {
	private UserAction userAction;
	public UserAction getUserAction() {
		return userAction;
	}

	@Resource
	public void setUserAction(UserAction userAction) {
		this.userAction = userAction;
	}



	@Test
	public void testSpring(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService userService = (UserService) context.getBean("userService");
//		userService.addUser(new User());
		
		UserAction userAction = (UserAction) context.getBean("userAction");
		System.out.println(userAction.add());
		context.destroy();
//		context.registerShutdownHook();
	}
}
