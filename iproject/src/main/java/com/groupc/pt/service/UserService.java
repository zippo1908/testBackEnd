package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.*;

public interface UserService {
//user
   long save(User User);
   User getU(long id);
   List<User> userlist();
   void update(long id, User User);
   void deleteU(long id);

}
