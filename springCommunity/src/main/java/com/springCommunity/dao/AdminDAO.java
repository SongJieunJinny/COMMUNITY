package com.springCommunity.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.protocol.Resultset;
import com.springCommunity.vo.UserInfoVO;


@Repository
public class AdminDAO {
	
	@Autowired
	public SqlSession sqlSession;
	
	private final String name_space = "com.springCommunity.mapper.adminMapper.";
	
	public int insertUsers(List<UserInfoVO> users) {
		return sqlSession.insert(name_space+"insertUsers",users);
	}
	
}
