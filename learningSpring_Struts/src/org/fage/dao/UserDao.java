package org.fage.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
	
	public void add(){
		System.out.println("增加用户");
	}
	
}
