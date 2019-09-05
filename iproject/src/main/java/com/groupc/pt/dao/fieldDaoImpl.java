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

import com.groupc.pt.model.userField;

@Repository
public class fieldDaoImpl implements fieldDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(userField userField) {
      sessionFactory.getCurrentSession().save(userField);
      return userField.getId();
   }

   @Override
   public userField get(long id) {
      return sessionFactory.getCurrentSession().get(userField.class, id);
   }

   @Override
   public List<userField> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<userField> cq = cb.createQuery(userField.class);
      Root<userField> root = cq.from(userField.class);
      cq.select(root);
      Query<userField> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, userField userField) {
      Session session = sessionFactory.getCurrentSession();
      userField userField2 = session.byId(userField.class).load(id);
      userField2.setName(userField.getName());
      userField2.setScope(userField.getScope());
      userField2.setTypeOfField(userField.getTypeField());
      session.flush();
   }

   @Override
   public void deleteU(long id) {
      Session session = sessionFactory.getCurrentSession();
      userField userField = session.byId(userField.class).load(id);
      session.delete(userField);
      session.flush();
   }

}
