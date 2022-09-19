package com.xie.map;

import com.xie.pojo.User;

import java.util.List;

public interface UserMapper {
   public List<User> getUserList();
   public List<User> getUserById(int id);
   public void addUser(User user);
   public void updateUser(User user);
   public void deleteUser(int id);

}
