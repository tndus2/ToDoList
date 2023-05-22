package com.ToDoList.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		log.info("log : {} ","여기");
		// list로 바꿔야함 조회 니까 05.23
		String contents = mybaService.mybatisDbTest();
		log.info("오늘 내가 할 일 :: {} ", contents);
		return "오늘 내가 할 일 :: " + contents;
	}

	@PostMapping("/write")
	public String writeTodo(){
		String contents = mybaService.writeTodo();
		return contents;
	}

}
