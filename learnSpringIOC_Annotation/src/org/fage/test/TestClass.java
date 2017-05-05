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
 *1. 默认的scope是单例singleton，prototype是每次new
 *2. @Resource默认按名字，@AutoAwre默认按类型
 *3. @component，@controller，@Service等等，都差不多，注意要在spring配置中增加包扫描
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
