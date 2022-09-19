package com.xie.map;

import com.xie.pojo.Student;
import com.xie.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudentList();
    public List<Student> getStudentById(@Param("id") int id);
    public void addStudent(@Param("id") int id,@Param("name") String name,@Param("tid") int tId);
    public void updateStudent(@Param("id") int id,@Param("name") String name,@Param("tid") int tId);
    public void deleteStudent(int id);
}
