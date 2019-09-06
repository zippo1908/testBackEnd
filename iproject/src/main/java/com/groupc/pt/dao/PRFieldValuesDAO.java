package com.groupc.pt.dao;

import java.util.List;
import com.groupc.pt.model.PRFieldValues;

public interface PRFieldValuesDAO {
	   long save(PRFieldValues fl);

	   PRFieldValues get(long id);

	   List<PRFieldValues> list();

	   void update(long id, PRFieldValues fl);

	   void deleteU(long id);
}
