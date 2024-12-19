package com.springCommunity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springCommunity.dao.AdminDAO;
import com.springCommunity.vo.UserInfoVO;

@Service //업무로직을 담당하는 구현 객체를 스프링이 생성하여 관리
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	public AdminDAO adminDAO;
	
	@Override
	public int insertUsers(List<UserInfoVO> users) {
		return adminDAO.insertUsers(users);
	}

}
