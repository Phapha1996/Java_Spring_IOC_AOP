package org.fage.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.fage.controller.UserAction;
import org.fage.domain.User;
import org.fage.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.SessionFactoryUtils;

public class TestClass {
	
	
	@Test
	public void testSpringUse(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction = ctx.getBean(UserAction.class, "userAction");
	}
	
	@Test
	public void testHibernateUser(){
		User u = new User();
		u.setPassword("123");
		u.setUsername("fage");
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory factory = new MetadataSources(standardServiceRegistry).buildMetadata().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
	}
	
	
	@Test
	public void testSpringDataSource() throws SQLException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		Connection conn = dataSource.getConnection();
		String sql = "insert into t_user values(?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1,2);
		st.setString(2,"haha");
		st.setString(3,"mama");
		st.executeUpdate();
		st.close();
		conn.close();
	}
	
	@Test
	public void testSpringSessionF(){
		User u = new User();
		u.setPassword("haha");
		u.setUsername("ddd");
		SessionFactory sf = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("sessionFactory");
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	
	@Test
	public void testlogin(){
		UserAction action = (UserAction) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userAction");
		System.out.println(action.login());
	}
	
	
	
	@Test
	public void testTransactionGet(){
		User user = new User();
		user.setPassword("123");
		user.setUsername("랙며");
		UserService service = (UserService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userService");
		System.out.println(service.loginUser(user));
		
	}
	
	@Test
	public void testTXAdd(){
		User user=  new User();
		user.setUsername("랙며");
		user.setPassword("123");
		UserService service = (UserService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userService");
		service.addUser(user);
	}

	
	
	
}


