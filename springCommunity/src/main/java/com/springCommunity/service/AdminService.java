package com.springCommunity.service;

import java.util.List;
import java.util.Map;

import com.springCommunity.vo.UserInfoVO;


public interface AdminService {
	
	public int insertUsers(List<UserInfoVO> users);
}
