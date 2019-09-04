package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.userProject;


public interface projectDao {
	   long save(userProject Kuser);

	   userProject get(long id);

	   List<userProject> list();

	   void update(long id, userProject Kuser);

	   void deleteU(long id);

}
