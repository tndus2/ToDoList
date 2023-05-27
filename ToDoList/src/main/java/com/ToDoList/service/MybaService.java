package com.ToDoList.service;

import com.ToDoList.repository.model.vo.Todos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ToDoList.repository.mapper.TestMapper;

import java.util.List;

@Service
@Transactional
public class MybaService {

	@Autowired
	TestMapper mapper;

	public String mybatisDbTest() {
		String contents = mapper.mybatisDbTest();
		return contents;
	}

	public String writeTodo() {
		String contents = mapper.mybatisWriteTodo();
		return contents;
	}


	public List<Todos> findAllList() {
		List<Todos> allList = mapper.findAllList();
		return allList;
	}
}
