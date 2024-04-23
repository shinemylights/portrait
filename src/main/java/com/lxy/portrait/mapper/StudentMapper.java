package com.lxy.portrait.mapper;

import com.lxy.portrait.domain.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 清晨
* @description 针对表【student】的数据库操作Mapper
* @createDate 2024-04-18 23:16:40
* @Entity com.lxy.portrait.domain.Student
*/
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}




