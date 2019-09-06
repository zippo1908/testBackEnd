package com.groupc.pt.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.groupc.pt.model.User;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(User User) {
      sessionFactory.getCurrentSession().save(User);
      return User.getId();
   }

   @Override
   public User get(long id) {
      return sessionFactory.getCurrentSession().get(User.class, id);
   }

   @Override
   public List<User> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<User> cq = cb.createQuery(User.class);
      Root<User> root = cq.from(User.class);
      cq.select(root);
      Query<User> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, User User) {
      Session session = sessionFactory.getCurrentSession();
      User User2 = session.byId(User.class).load(id);
      User2.setName(User.getName());
      User2.setPassword(User.getPassword());
      session.flush();
   }

   @Override
   public void deleteU(long id) {
      Session session = sessionFactory.getCurrentSession();
      User User = session.byId(User.class).load(id);
      session.delete(User);
      session.flush();
   }

   @Override
	public User getUbName(String name) {
	   
	   Session session = sessionFactory.getCurrentSession();
	   Query hql = session.createQuery("From User as u where u.name=:name");
	   hql.setParameter("name", name);
	   User User = (User)hql.getSingleResult();
	   return User;
   
   }

}
