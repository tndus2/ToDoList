package com.ToDoList.repository.model.vo;

import lombok.*;
import java.sql.Timestamp;

@Getter @Setter @ToString
public class Todos {

  private String contents;
  private Timestamp reg_date;
  private String del_yn;
}
