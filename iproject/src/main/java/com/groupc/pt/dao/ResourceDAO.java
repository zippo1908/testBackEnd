package com.groupc.pt.dao;

import java.util.List;

import com.groupc.pt.model.Resource;

public interface ResourceDAO {
	   long save(Resource resource);

	   Resource get(long id);

	   List<Resource> list();

	   void update(long id, Resource project);

	   void deleteU(long id);
}
