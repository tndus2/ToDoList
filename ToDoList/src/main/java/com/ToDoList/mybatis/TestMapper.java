package com.ToDoList.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
	public Integer testMapper(String findStr);

	public String mybatisDbTest();
}
