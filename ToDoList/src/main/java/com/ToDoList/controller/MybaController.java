package com.ToDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ToDoList.service.MybaService;

@RestController
public class MybaController {
	
	@Autowired
	MybaService mybaService;
	
	@GetMapping(value = "/test")
	public String mybatisDbTest() {
		System.out.println("여기");
		
		String contents = mybaService.mybatisDbTest();

		return "오늘 내가 할 일 :: " + contents;
	}

}
