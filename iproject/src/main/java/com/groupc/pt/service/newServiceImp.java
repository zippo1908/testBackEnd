package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.KuserDao;

import com.groupc.pt.model.Kuser;

@Service
@Transactional(readOnly = true)
public class newServiceImp implements newService {

   @Autowired
   private KuserDao KuserDao;

   @Transactional
   @Override
   public long save(Kuser usr) {
      return KuserDao.save(usr);
   }
   

   @Override
   public Kuser getU(long id) {
      return KuserDao.get(id);
   }

   @Override
   public List<Kuser> userlist() {
      return KuserDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Kuser Kuser) {
      KuserDao.update(id, Kuser);
   }

   @Transactional
   @Override
   public void deleteU(long id) {
      KuserDao.deleteU(id);
   }



}
