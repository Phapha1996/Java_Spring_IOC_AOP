package org.fage.dao;


import org.fage.domain.User;
import org.springframework.stereotype.Repository;
@Repository
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
