package com.divergentsl.cms_springboot.service;

import java.util.List;

import com.divergentsl.cms_springboot.model.Doctor;

public interface DoctorService {

	void insertDoctor(Doctor doctor);
	
	List<Doctor> show();
	
	void remove(Doctor doctor);
	
	Doctor findById(String id);

	void updateName(Doctor doctor);

	void updateSpecialization(Doctor doctor);

	void updateFees(Doctor doctor);

	void updateDegree(Doctor doctor);

	void updatePrescription(Doctor doctor);
	
	
}