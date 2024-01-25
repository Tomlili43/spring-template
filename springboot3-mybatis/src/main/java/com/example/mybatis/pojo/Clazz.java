package com.example.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {

  private Integer cId; // 课程id

  private String cName; // 课程名

  private String teacher; // 课程教师

  private Integer cHour; // 学时

  private Integer credit; // 学分
}
