package com.divergentsl.cms_springboot.dao;

import java.util.List;

import com.divergentsl.cms_springboot.model.Patient;

public interface PatientDaoI {

void insertPatient(Patient patient);
	
	List<Patient> showPatient();
	
	void update(Patient patient);
	
	void deletePatient(Patient patient);
	
	Patient findById(String id);
}
