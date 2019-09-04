package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.*;

public interface newService {
//user
   long save(Kuser Kuser);
   Kuser getU(long id);
   List<Kuser> userlist();
   void update(long id, Kuser Kuser);
   void deleteU(long id);

}
