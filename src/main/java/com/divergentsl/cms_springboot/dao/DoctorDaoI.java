package com.divergentsl.cms_springboot.dao;

import java.util.List;

import com.divergentsl.cms_springboot.model.Doctor;

public interface DoctorDaoI {

void insertDoctor(Doctor doctor);
	
	List<Doctor> show();
	
	void remove(Doctor doctor);
	
	void update(Doctor doctor);
	
	Doctor findById(String id);
}
