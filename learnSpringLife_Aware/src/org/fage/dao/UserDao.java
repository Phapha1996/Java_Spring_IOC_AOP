package org.fage.dao;


import org.fage.domain.User;
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
