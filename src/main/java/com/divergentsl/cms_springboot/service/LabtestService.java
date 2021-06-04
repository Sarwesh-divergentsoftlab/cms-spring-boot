package com.divergentsl.cms_springboot.service;

import java.util.List;

import com.divergentsl.cms_springboot.model.Labtest;

public interface LabtestService {
	
	void insertLabtest(Labtest labtest);
	
	List<Labtest> showLabtest();
	
	void updatePrice(Labtest labtest);

	void updateName(Labtest labtest);

}
