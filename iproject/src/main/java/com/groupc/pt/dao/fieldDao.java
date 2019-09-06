package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.Fields;

public interface fieldDao {
	   long save(Fields fl);

	   Fields get(long id);

	   List<Fields> list();

	   void update(long id, Fields fl);

	   void deleteU(long id);

}
