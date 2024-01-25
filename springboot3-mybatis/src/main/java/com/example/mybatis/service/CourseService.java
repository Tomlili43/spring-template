package com.example.mybatis.service;

import com.example.mybatis.pojo.*;

import java.util.List;

public interface CourseService {
  List<Clazz> getClazzByMoHu(String cname);
}
