package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.ResourceDAO;
import com.groupc.pt.model.Resource;
@Service
@Transactional(readOnly = true)
public class ResourceServiceImpl implements ResourceService{
	@Autowired
	private ResourceDAO ResourceDAO;
	@Override
	public long save(Resource Kuser) {
		return ResourceDAO.save(Kuser);
	}
	
	@Override
	public Resource getU(long id) {
		return ResourceDAO.get(id);
	}

	@Override
	public List<Resource> userlist() {
		return ResourceDAO.list();
	}

	@Override
	public void update(long id, Resource Kuser) {
		ResourceDAO.update(id, Kuser);
	}

	@Override
	public void deleteU(long id) {
		 ResourceDAO.deleteU(id);
	}


}
