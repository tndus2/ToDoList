package com.ToDoList.repository.mapper;

import com.ToDoList.repository.model.vo.Todos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
	public Integer testMapper(String findStr);

	public String mybatisDbTest();

	public String mybatisWriteTodo();

	public List<Todos> findAllList();
}
