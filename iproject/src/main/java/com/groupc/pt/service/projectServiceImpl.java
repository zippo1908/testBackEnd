package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.projectDao;
import com.groupc.pt.model.userProject;
@Service
@Transactional(readOnly = true)
public class projectServiceImpl implements projectService{
	@Autowired
	private projectDao projectDao;
	@Override
	public long save(userProject Kuser) {
		return projectDao.save(Kuser);
	}
	
	@Override
	public userProject getU(long id) {
		return projectDao.get(id);
	}

	@Override
	public List<userProject> userlist() {
		return projectDao.list();
	}

	@Override
	public void update(long id, userProject Kuser) {
		projectDao.update(id, Kuser);
	}

	@Override
	public void deleteU(long id) {
		 projectDao.deleteU(id);
	}

}
