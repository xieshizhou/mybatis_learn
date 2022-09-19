package com.xie.map;

import com.xie.pojo.Student;
import com.xie.pojo.Teacher;
import com.xie.pojo.User;
import com.xie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        if(sqlSession!=null){
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teacherList = mapper.getTeacherList();
            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }
        }


    }
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        if(sqlSession!=null){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserById(1);
            for (User user : userList) {
                System.out.println(user);
            }
        }

        sqlSession.close();

    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        if(sqlSession!=null){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
          mapper.addUser(new User(51, "谢仕洲", "xsz123"));

        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        if(sqlSession!=null){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.updateUser(new User(51, "郭濒莲", "thankyou,./123"));

        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        if(sqlSession!=null){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.deleteUser(51);

        }
        sqlSession.commit();
        sqlSession.close();

    }
}
