package com.ara.myAra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testService {

	@Autowired
	private testDao testDao;
	
	public String test(){
		return testDao.test();
	}
}
