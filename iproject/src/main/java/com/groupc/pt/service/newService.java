package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.*;
//import com.boraji.tutorial.spring.model.theProject;

public interface newService {

   long save(Kuser Kuser);
   Kuser get(long id);
   List<Kuser> list();
   void update(long id, Kuser Kuser);
   void delete(long id);
}
