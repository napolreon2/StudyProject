package com.ara.myAra;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class testDao {

	@Autowired
	SqlSessionTemplate sqlSession;	
	
	public String test() {
		System.out.println("dao입니다");
		return sqlSession.selectOne("ttst.tts", "ID");
	}
	
}
