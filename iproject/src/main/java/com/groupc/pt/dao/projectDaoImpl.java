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

import com.groupc.pt.model.userProject;

@Repository
public class projectDaoImpl implements projectDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(userProject Kuser) {
	      sessionFactory.getCurrentSession().save(Kuser);
	      return Kuser.getId();
	}

	@Override
	public userProject get(long id) {
	return sessionFactory.getCurrentSession().get(userProject.class, id);
	}

	@Override
	public List<userProject> list() {
	      Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<userProject> cq = cb.createQuery(userProject.class);
	      Root<userProject> root = cq.from(userProject.class);
	      cq.select(root);
	      Query<userProject> query = session.createQuery(cq);
	      return query.getResultList();
	   }

	@Override
	public void update(long id, userProject Kuser) {
	      Session session = sessionFactory.getCurrentSession();
	      userProject Kuser2 = session.byId(userProject.class).load(id);
	      Kuser2.setName(Kuser.getName());
	      session.flush();
	   }
	@Override
	public void deleteU(long id) {
	      Session session = sessionFactory.getCurrentSession();
	      userProject Kuser = session.byId(userProject.class).load(id);
	      session.delete(Kuser);
	}

}
