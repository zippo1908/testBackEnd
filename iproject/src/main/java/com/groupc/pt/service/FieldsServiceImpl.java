package com.groupc.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groupc.pt.dao.fieldDao;
import com.groupc.pt.model.Fields;
@Service
@Transactional(readOnly = true)
public class FieldsServiceImpl implements FieldsService {
	@Autowired
	private fieldDao fieldDao;
	@Override
	public long save(Fields userField) {
		return fieldDao.save(userField);
	}
	
	@Override
	public Fields getU(long id) {
		return fieldDao.get(id);
	}

	@Override
	public List<Fields> userlist() {
		return fieldDao.list();
	}

	@Override
	public void update(long id, Fields userField) {
		fieldDao.update(id, userField);
	}

	@Override
	public void deleteU(long id) {
		 fieldDao.deleteU(id);
	}

}
