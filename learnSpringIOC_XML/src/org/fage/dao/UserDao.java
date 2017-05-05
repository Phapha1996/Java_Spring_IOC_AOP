package org.fage.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.fage.domain.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
public class UserDao {

	public void add(User user){
		System.out.println("增加一个用户");
	}
	
	public void init(){
		System.out.println("DAO已经初始化");
		
	}
	public void destroy(){
		System.out.println("DAO销毁");
	}
	
}
