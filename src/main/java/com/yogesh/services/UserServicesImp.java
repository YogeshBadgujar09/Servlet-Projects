package com.yogesh.services;

import com.yogesh.dao.UserDAO;
import com.yogesh.dao.UserDAOimplement;
import com.yogesh.entity.User;

public class UserServicesImp implements UserServices {
	
	private UserDAO userDAO;
	
	@Override
	public User loginService(String email, String password) {
		
		userDAO = new UserDAOimplement();
		
	
		System.out.println("Data enter in Services :" + email + " " + password);
		
		User user =  userDAO.login(email, password);
	
		if(user == null) {
			System.out.println("Account not found with " + email);	
			return null;
		} 
		
		if(password.equals(user.getPassword())) {
			System.out.println("Email and Password Match");
			return user;
		}else {
			System.out.println("Password Not Match");
		}
		
		return null;
	}

}
