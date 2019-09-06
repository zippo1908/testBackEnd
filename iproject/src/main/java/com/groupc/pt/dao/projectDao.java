package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.Projects;


public interface projectDao {
	   long save(Projects project);

	   Projects get(long id);

	   List<Projects> list();

	   void update(long id, Projects project);

	   void deleteU(long id);

}
