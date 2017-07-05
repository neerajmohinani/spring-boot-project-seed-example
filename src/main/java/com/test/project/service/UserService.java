package com.test.project.service;

import com.test.project.model.User;


public class UserService extends AbstractService<User> {
	
	public UserService() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		super("userDao");
	}
	
	
	
}
