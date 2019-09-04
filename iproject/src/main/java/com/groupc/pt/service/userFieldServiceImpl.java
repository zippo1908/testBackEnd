package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.fieldDao;
import com.groupc.pt.model.userField;
@Service
@Transactional(readOnly = true)
public class userFieldServiceImpl implements userFieldService {
	@Autowired
	private fieldDao fieldDao;
	@Override
	public long save(userField userField) {
		return fieldDao.save(userField);
	}
	
	@Override
	public userField getU(long id) {
		return fieldDao.get(id);
	}

	@Override
	public List<userField> userlist() {
		return fieldDao.list();
	}

	@Override
	public void update(long id, userField userField) {
		fieldDao.update(id, userField);
	}

	@Override
	public void deleteU(long id) {
		 fieldDao.deleteU(id);
	}

}
