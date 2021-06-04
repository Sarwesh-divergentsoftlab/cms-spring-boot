package com.divergentsl.cms_springboot.service;

import java.util.List;

import com.divergentsl.cms_springboot.model.Drug;

public interface DrugService {
	
	void insertDrug(Drug drug);
	
	List<Drug> showDrug();

	void updateDrugName(Drug drug);

	void updateDrugPrice(Drug drug);
	
	

}
