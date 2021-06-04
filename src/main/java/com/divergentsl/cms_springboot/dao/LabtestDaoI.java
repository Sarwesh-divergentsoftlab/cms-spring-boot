package com.divergentsl.cms_springboot.dao;

import java.util.List;

import com.divergentsl.cms_springboot.model.Labtest;

public interface LabtestDaoI {

void insertLabtest(Labtest labtest);
	
	List<Labtest> showLabtest();
	
	void update(Labtest labtest);

	Labtest findById(String id);
	
	
}
