package org.fage.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.fage.domain.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
public class UserDao {

	public void add(User user){
		System.out.println("����һ���û�");
	}
	
	public void init(){
		System.out.println("DAO�Ѿ���ʼ��");
		
	}
	public void destroy(){
		System.out.println("DAO����");
	}
	
}
