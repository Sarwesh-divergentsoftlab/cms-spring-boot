package com.divergentsl.cms_springboot.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.LabtestDaoI;
import com.divergentsl.cms_springboot.model.Labtest;
@Service
public class LabtestServiceImpl implements LabtestService{
	
	@Autowired
	LabtestDaoI labtestDaoi ;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void insertLabtest(Labtest labtest) {
				
		labtestDaoi.insertLabtest(labtest);
	}

	@Override
	public List<Labtest> showLabtest() {
		// TODO Auto-generated method stub
		return labtestDaoi.showLabtest();
	}

	
	@Override
	public void updateName(Labtest labtest) {
		// TODO Auto-generated method stub
		String dname= labtest.getName();
		labtest= findById(labtest.getLabtest_id());
		labtest.setName(dname);
		labtestDaoi.update(labtest);
	}
	
	public Labtest findById(String id) {
		// TODO Auto-generated method stub
		return labtestDaoi.findById(id);
	}

	@Override
	public void updatePrice(Labtest labtest) {
		String dname= labtest.getName();
		labtest= findById(labtest.getLabtest_id());
		labtest.setLabtest_price(dname);
		labtestDaoi.update(labtest);
	}
}
