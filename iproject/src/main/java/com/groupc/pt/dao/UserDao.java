package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.User;

public interface UserDao {

   long save(User Kuser);

   User get(long id);

   List<User> list();

   void update(long id, User Kuser);

   void deleteU(long id);

}
