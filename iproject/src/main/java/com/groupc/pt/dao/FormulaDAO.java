package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.Formulas;

public interface FormulaDAO {
	   long save(Formulas formula);

	   Formulas get(long id);

	   List<Formulas> list();

	   void update(long id, Formulas formula);

	   void deleteU(long id);

	
}
