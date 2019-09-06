package com.groupc.pt.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

import com.groupc.pt.model.Resource;

@Entity
public class Resource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long ResourceCode;
	private String ResourceName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getResourceCode() {
		return ResourceCode;
	}
	
	public void setResourceCode(long ResourceCode) {
		this.ResourceCode = ResourceCode;
	}

	public void setResourceName(String ResourceName) {
		this.ResourceName = ResourceName;
	}

	public String getResourceName() {
		return ResourceName;
	}

}
