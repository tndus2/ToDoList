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
	
	@RequestMapping(value = "/")
	public String mybatisDbTest() {
		
		String name = mybaService.mybatisDbTest();

		return "name :: " + name;
	}

}
