package com.example.mybatis.mapper;

import com.example.mybatis.pojo.Clazz;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper {
  List<Clazz> getClazzByMoHu(@Param("cname") String uname);
}
