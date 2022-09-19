package com.xie.map;

import com.xie.pojo.Teacher;
import com.xie.pojo.User;

import java.util.List;

public interface TeacherMapper {
    public List<Teacher> getTeacherList();
    public List<Teacher> getTeacherById(int id);
    public void addTeacher(User user);
    public void updateTeacher(User user);
    public void deleteTeacher(int id);
}
