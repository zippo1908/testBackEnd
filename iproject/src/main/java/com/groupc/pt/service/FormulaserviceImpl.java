package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.FormulaDAO;
import com.groupc.pt.model.Formulas;
@Service
@Transactional(readOnly = true)
public class FormulaserviceImpl implements FormulaService{
	@Autowired
	private FormulaDAO FormulaDAO;
	@Override
	public long save(Formulas Kuser) {
		return FormulaDAO.save(Kuser);
	}
	
	@Override
	public Formulas getU(long id) {
		return FormulaDAO.get(id);
	}

	@Override
	public List<Formulas> Flist() {
		return FormulaDAO.list();
	}

	@Override
	public void update(long id, Formulas Kuser) {
		FormulaDAO.update(id, Kuser);
	}

	@Override
	public void deleteU(long id) {
		 FormulaDAO.deleteU(id);
	}

}
