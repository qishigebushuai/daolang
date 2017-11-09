package com.mianshi.dao;

import com.mianshi.entity.User;

public interface UserDao {

	public void regist(User user);
	
	public User login(String username);
	
}
