package com.springCommunity.controller;


import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springCommunity.vo.UserInfoVO;

@Controller
public class UserController {
	
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value="/login.do", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="/join.do", method = RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value="/joinOk.do", method = RequestMethod.POST)
	public String joinOk(UserInfoVO userInfoVO) {
		BCryptPasswordEncoder epwe = new BCryptPasswordEncoder();
		String encodedPassword = epwe.encode(userInfoVO.getUSER_PASSWORD());
		userInfoVO.setUSER_PASSWORD(encodedPassword);
		System.out.println("암호화된 비밀번호: " + encodedPassword);
		
		int result = sqlSession.insert("com.springCommunity.mapper.userMapper.insert", userInfoVO);
		
		if(result > 0) {
			System.out.println("회원가입성공");
		}else {
			System.out.println("회원가입실패");
		}
		
		return "redirect:/";
	}
}
