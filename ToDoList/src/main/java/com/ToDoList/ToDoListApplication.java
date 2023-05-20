package com.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ToDoList.service.MybaService;

@SpringBootApplication()
public class ToDoListApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
		
	}
	

}
