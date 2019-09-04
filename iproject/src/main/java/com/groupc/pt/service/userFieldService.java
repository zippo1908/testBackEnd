package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.*;

public interface userFieldService {
//user
   long save(userField userField);
   userField getU(long id);
   List<userField> userlist();
   void update(long id, userField userField);
   void deleteU(long id);

}
