package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.userProject;

public interface projectService {
	   long save(userProject Kuser);
	   userProject getU(long id);
	   List<userProject> userlist();
	   void update(long id, userProject Kuser);
	   void deleteU(long id);
}
