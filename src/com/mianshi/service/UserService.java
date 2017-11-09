package com.mianshi.service;

import com.mianshi.entity.User;

public interface UserService {
	
	public void regist(User user);
	
	public User login(String username);
	
}
