package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.*;
import com.example.mybatis.pojo.*;
import com.example.mybatis.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

  @Autowired
  private CourseMapper courseMapper;

  public List<Clazz> getClazzByMoHu(String cname) {
    return courseMapper.getClazzByMoHu(cname);
  }
}
