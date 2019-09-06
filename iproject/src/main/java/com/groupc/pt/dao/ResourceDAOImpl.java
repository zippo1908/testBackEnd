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

import com.groupc.pt.model.Resource;

@Repository
public class ResourceDAOImpl implements ResourceDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Resource resource) {
	      sessionFactory.getCurrentSession().save(resource);
	      return resource.getResourceCode();
	}

	@Override
	public Resource get(long id) {
		return sessionFactory.getCurrentSession().get(Resource.class, id);
	}

	@Override
	public List<Resource> list() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Resource> cq = cb.createQuery(Resource.class);
		Root<Resource> root = cq.from(Resource.class);
		cq.select(root);
		Query<Resource> query = session.createQuery(cq);
	    return query.getResultList();
	}

	@Override
	public void update(long id, Resource resource) {
		Session session = sessionFactory.getCurrentSession();
		Resource newResource = session.byId(Resource.class).load(id);
		newResource.setResourceName(resource.getResourceName());
		session.flush();
	}

	@Override
	public void deleteU(long id) {
	      Session session = sessionFactory.getCurrentSession();
	      Resource resource = session.byId(Resource.class).load(id);
	      session.delete(resource);
	      session.flush();
	}

}
