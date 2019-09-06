package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.Resource;;

public interface ResourceService {
	   long save(Resource User);
	   Resource getU(long id);
	   List<Resource> userlist();
	   void update(long id, Resource User);
	   void deleteU(long id);
	  
}
