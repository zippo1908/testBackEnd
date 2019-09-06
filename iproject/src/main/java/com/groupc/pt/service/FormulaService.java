package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.Formulas;

public interface FormulaService {
	   long save(Formulas userField);
	   Formulas getU(long id);
	   List<Formulas> Flist();
	   void update(long id, Formulas userField);
	   void deleteU(long id);


}
