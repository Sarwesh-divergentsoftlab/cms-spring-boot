package com.divergentsl.cms_springboot.service;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.DrugDaoI;
import com.divergentsl.cms_springboot.model.Drug;
@Service
public class DrugServiceImpl implements DrugService{

	@Autowired
	private DrugDaoI drugDaoI;
	Scanner sc = new Scanner(System.in);
	@Transactional
	@Override
	public void insertDrug(Drug drug) {
		drugDaoI.insertDrug(drug);
	}

	@Override
	public List<Drug> showDrug() {

		return drugDaoI.showDrug();
	}
	
	public Drug findById(String id) {
		return drugDaoI.findById(id);
	}
	
	@Override
	public void updateDrugName(Drug drug) {

		String dname= drug.getName();
		drug = findById(drug.getDrug_id());
		drug.setName(dname);
			drugDaoI.update(drug);
	}

	@Override
	public void updateDrugPrice(Drug drug)
	{
        String id = sc.next();
        System.out.println("enter updated drug price");
        String price=sc.next();
		drug = findById(id);
		drug.setDrug_id(id);
		drug.setDrug_price(price);
		drugDaoI.update(drug);
	}
}
