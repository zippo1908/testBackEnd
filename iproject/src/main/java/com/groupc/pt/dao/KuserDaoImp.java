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

import com.groupc.pt.model.Kuser;

@Repository
public class KuserDaoImp implements KuserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Kuser Kuser) {
      sessionFactory.getCurrentSession().save(Kuser);
      return Kuser.getId();
   }

   @Override
   public Kuser get(long id) {
      return sessionFactory.getCurrentSession().get(Kuser.class, id);
   }

   @Override
   public List<Kuser> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Kuser> cq = cb.createQuery(Kuser.class);
      Root<Kuser> root = cq.from(Kuser.class);
      cq.select(root);
      Query<Kuser> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Kuser Kuser) {
      Session session = sessionFactory.getCurrentSession();
      Kuser Kuser2 = session.byId(Kuser.class).load(id);
      Kuser2.setName(Kuser.getName());
      Kuser2.setPassword(Kuser.getPassword());
      session.flush();
   }

   @Override
   public void deleteU(long id) {
      Session session = sessionFactory.getCurrentSession();
      Kuser Kuser = session.byId(Kuser.class).load(id);
      session.delete(Kuser);
   }

}
