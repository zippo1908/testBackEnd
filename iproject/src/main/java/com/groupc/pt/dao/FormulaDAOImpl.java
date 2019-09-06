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

//import com.groupc.pt.model.Fields;
import com.groupc.pt.model.Formulas;
//import com.groupc.pt.model.Resource;

@Repository
public class FormulaDAOImpl implements FormulaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Formulas formula) {
	      sessionFactory.getCurrentSession().save(formula);
	      return formula.getId();
	}

	@Override
	public Formulas get(long id) {
		return sessionFactory.getCurrentSession().get(Formulas.class, id);
	}

	@Override
	public List<Formulas> list() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Formulas> cq = cb.createQuery(Formulas.class);
		Root<Formulas> root = cq.from(Formulas.class);
		cq.select(root);
		Query<Formulas> query = session.createQuery(cq);
	    return query.getResultList();
	}

	@Override
	public void update(long id, Formulas formula) {
		Session session = sessionFactory.getCurrentSession();
		Formulas newFormula = session.byId(Formulas.class).load(id);
		newFormula.setFormula(formula.getFormula());
		session.flush();
	}

	@Override
	public void deleteU(long id) {
	      Session session = sessionFactory.getCurrentSession();
	      Formulas Fields = session.byId(Formulas.class).load(id);
	      session.delete(Fields);
	      session.flush();
	}

}
