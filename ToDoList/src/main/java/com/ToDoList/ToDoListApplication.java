package com.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// DB디펜던시 추가했는데 DB 연결 안해서 오류 뜨길래 임시로 돌아가기만하게 설정
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//exclude 디비 설정시 지워야함
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
		
		System.out.println("test");
	}

}
