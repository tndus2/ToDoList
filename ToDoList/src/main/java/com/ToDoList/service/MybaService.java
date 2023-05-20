package com.ToDoList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ToDoList.mybatis.TestMapper;

@Service
@Transactional
public class MybaService {
	
	@Autowired
	TestMapper mapper;

	public String mybatisDbTest() {
		String contents = mapper.mybatisDbTest();
		return contents;
	}
	
}
