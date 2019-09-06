package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.PRFieldValues;

public interface PRFService {
	   long save(PRFieldValues Kuser);
	   PRFieldValues getU(long id);
	   List<PRFieldValues> userlist();
	   void update(long id, PRFieldValues Kuser);
	   void deleteU(long id);

}
