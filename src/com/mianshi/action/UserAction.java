package com.mianshi.action;

import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mianshi.entity.User;
import com.mianshi.service.UserService;

@Controller
@RequestMapping("user")
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("regist")
	public String regist(String username,String password){
		System.out.println(userService);
		User user2 = new User(username, password, new Date());
		System.out.println(user2);
		userService.regist(user2);
		System.out.println(111111111);
		return "index";
	}
	
	@RequestMapping("login")
	public String login(String username,String password){
		System.out.println(username);
		System.out.println(password);
		User user2 = userService.login(username);
		String pass=password+username;
		String passSalt = DigestUtils.md5Hex(pass);
		if(user2.getPassword().equals(passSalt)){
			return "index";
		}else{
			return "/jsp/1";
		}
	}

	
	
	
	
}
