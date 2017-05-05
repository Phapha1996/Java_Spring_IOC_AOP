package org.fage.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.fage.domain.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository("userDao")
public class UserDao {

	public void add(User user){
		System.out.println("增加一个用户");
	}
	
	
}
