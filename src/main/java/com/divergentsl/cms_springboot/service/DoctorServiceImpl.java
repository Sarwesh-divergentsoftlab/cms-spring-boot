package com.divergentsl.cms_springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.DoctorDaoI;
import com.divergentsl.cms_springboot.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorDaoI doctorDaoi;
	
	@Override
	public void insertDoctor(Doctor doctor) {

		doctorDaoi.insertDoctor(doctor);
	}

	@Override
	public List<Doctor> show() {
		// TODO Auto-generated method stub
		
		return doctorDaoi.show();
		
	}

	@Override
	public void remove(Doctor del) {
		del = findById(del.getDoctor_id());
		doctorDaoi.remove(del);
	}

	@Override
	public Doctor findById(String id) {
		// TODO Auto-generated method stub
		return doctorDaoi.findById(id);
	}

	@Override
	public void updateName(Doctor name) {
		System.out.println("enter updated name"+" "+name.getName());
		String dname= name.getName();
		name = findById(name.getDoctor_id());
		name.setName(dname);
		System.out.println("enter updated name"+" "+name.getName());
		doctorDaoi.update(name);
	}

	@Override
	public void updateSpecialization(Doctor name) {
		String dname= name.getSpecializatio();
		name = findById(name.getDoctor_id());
		name.setSpecializatio(dname);
		doctorDaoi.update(name);
	}

	@Override
	public void updateFees(Doctor name) {
		String dname= name.getFees();
		name = findById(name.getDoctor_id());
		name.setFees(dname);
		doctorDaoi.update(name);		
	}

	@Override
	public void updateDegree(Doctor name) {
		String dname= name.getDegree();
		name = findById(name.getDoctor_id());
		name.setDegree(dname);
		doctorDaoi.update(name);	
	}

	@Override
	public void updatePrescription(Doctor name) {
		String dname= name.getPrescription();
		name = findById(name.getDoctor_id());
		name.setPrescription(dname);
		doctorDaoi.update(name);
	}
	

}
