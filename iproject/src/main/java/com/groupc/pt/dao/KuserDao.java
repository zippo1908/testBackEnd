package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.Kuser;

public interface KuserDao {

   long save(Kuser Kuser);

   Kuser get(long id);

   List<Kuser> list();

   void update(long id, Kuser Kuser);

   void deleteU(long id);

}
