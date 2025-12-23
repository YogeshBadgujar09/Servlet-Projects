package com.yogesh.dao;

import com.yogesh.entity.User;
import com.yogesh.model.UserModel;

public interface UserDAO {
		
	public void setUser(UserModel userModel);
	public User getUser();
	
}
