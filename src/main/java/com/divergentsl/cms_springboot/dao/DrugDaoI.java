package com.divergentsl.cms_springboot.dao;

import java.util.List;

import com.divergentsl.cms_springboot.model.Drug;

public interface DrugDaoI {

	void insertDrug(Drug drug);
	
	List<Drug> showDrug();
	
	void update(Drug drug);

	Drug findById(String id);
	

}
