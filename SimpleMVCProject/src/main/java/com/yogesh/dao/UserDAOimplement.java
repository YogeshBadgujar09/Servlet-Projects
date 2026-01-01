package com.yogesh.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yogesh.entity.User;
import com.yogesh.model.UserModel;
import com.yogesh.util.SingletonDesignPattern;


public class UserDAOimplement implements UserDAO {

	private SessionFactory sessionFactory;
	private Session session;
	
	@Override
	public void setUser(UserModel userModel) {
		
			User user = new User();
		
			user.setName(userModel.getName());
			user.setEmail(userModel.getEmail());
			user.setMobile(userModel.getMobile());
			user.setGender(userModel.getGender());
			user.setDiscription(userModel.getDiscription());
			user.setPassword(userModel.getPassword());
			
			sessionFactory = SingletonDesignPattern.getSessionFactoryInstance(); 
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.close();
	}
	
	@Override
	public User getUser(UserModel userModel) {	
		return null;
	}

	@Override
	public User login(String email, String password) {
	
		System.out.println("Data enter : " + email + " " + password);
		
		session = SingletonDesignPattern.getSessionFactoryInstance().openSession();
		session.beginTransaction();
		
		User user = session.createQuery("FROM User WHERE email = :email", User.class).setParameter("email", email).uniqueResult();
		
//		System.out.println("RetTrival Data : " + user.getEmail() + " " + user.getPassword());
			
		session.close();
		
		return user ;
	}
}
