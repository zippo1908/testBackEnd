package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.UserDao;

import com.groupc.pt.model.User;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao UserDao;

   @Transactional
   @Override
   public long save(User usr) {
      return UserDao.save(usr);
   }
   

   @Override
   public User getU(long id) {
      return UserDao.get(id);
   }

   @Override
   public List<User> userlist() {
      return UserDao.list();
   }

   @Transactional
   @Override
   public void update(long id, User User) {
      UserDao.update(id, User);
   }

   @Transactional
   @Override
   public void deleteU(long id) {
      UserDao.deleteU(id);
   }


   @Override
   public Boolean autho(User user) {
	System.out.println(user.getName());
	System.out.println(user.getPassword());
	String string = UserDao.getUbName(user.getName()).getPassword();
	System.out.print(string);
	if(string.equalsIgnoreCase(user.getPassword())) {
		return true;
	}
	return false;

}



}
