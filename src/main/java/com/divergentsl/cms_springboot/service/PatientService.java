package com.divergentsl.cms_springboot.service;

import java.util.List;

import com.divergentsl.cms_springboot.model.Patient;

public interface PatientService {

	void insertPatient(Patient patient);
	
	List<Patient> showPatient();
	
	void deletePatient(Patient patient);

	void updateContact(Patient patient);

	void updateAppDate(Patient patient);

	void updateProblem(Patient patient);

	void updateWieght(Patient patient);

	void updateAge(Patient patient);

	void updateName(Patient patient);
}
