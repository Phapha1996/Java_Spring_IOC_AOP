package org.fage.dao;


import org.fage.domain.User;
import org.springframework.stereotype.Repository;
@Repository
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
