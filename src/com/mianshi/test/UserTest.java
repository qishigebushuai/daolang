package com.mianshi.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mianshi.entity.User;
import com.mianshi.service.UserService;

public class UserTest {
	private ApplicationContext ctx;
	
	@Before
	public void before(){
		ctx=new ClassPathXmlApplicationContext("spring.xml");
	}
	
	@Test
	public void regist(){
		UserService userService = (UserService) ctx.getBean("userService");
		User user = new User("meng4", "123123", new Date());
		userService.regist(user);
	}
	
	@Test
	public void login(){
		UserService userService = (UserService) ctx.getBean("userService");
		User user = userService.login("chens");
		System.out.println(user);
	}
	
}
