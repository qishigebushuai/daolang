package com.mianshi.service.impl;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.mianshi.dao.UserDao;
import com.mianshi.entity.User;
import com.mianshi.service.UserService;
@Controller
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;
	
	

	@Override
	public void regist(User user) {
		user.setId(UUID.randomUUID().toString().replace(",", "").substring(0,5));
		String password = user.getPassword();
		String pass=password+user.getUsername();
		String pw = DigestUtils.md5Hex(pass);
		user.setPassword(pw);//加密
		dao.regist(user);
	}

	@Override
	public User login(String username) {
		return dao.login(username);
	}

}
