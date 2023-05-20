package com.ToDoList.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ToDoList.service.MybaService;

@RestController
@Slf4j
public class MybaController {
	
	@Autowired
	MybaService mybaService;
	
	@GetMapping(value = "/test")
	public String mybatisDbTest() {
		//System.out.println("여기");
		log.info("log : {} ","여기");
		String contents = mybaService.mybatisDbTest();
		log.info("오늘 내가 할 일 :: {} ", contents);
		return "오늘 내가 할 일 :: " + contents;
	}

}
