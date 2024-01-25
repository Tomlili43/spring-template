package com.example.mybatis.controller;

import com.example.mybatis.pojo.Clazz;
import com.example.mybatis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

  @Autowired
  private CourseService courseService;

  @PostMapping("/search/coursename")
  public List<Clazz> searchUsername(@RequestParam("coursename") String coursename, Model model) {

    return courseService.getClazzByMoHu(coursename);
  }
}
