package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.userField;

public interface fieldDao {
	   long save(userField fl);

	   userField get(long id);

	   List<userField> list();

	   void update(long id, userField fl);

	   void deleteU(long id);

}
