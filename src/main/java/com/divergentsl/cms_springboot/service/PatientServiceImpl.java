package com.divergentsl.cms_springboot.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.PatientDaoI;
import com.divergentsl.cms_springboot.model.Patient;
@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientDaoI patientDaoi;
	@Override
	public void insertPatient(Patient patient) {

		patientDaoi.insertPatient(patient);
	}

	@Override
	public List<Patient> showPatient() {
		// TODO Auto-generated method stub
		return patientDaoi.showPatient();
	}

	@Override
	public void updateName(Patient patient) {
		// TODO Auto-generated method stub
		String pname= patient.getName();
		patient = findById(patient.getPatient_id());
		patient.setName(pname);
		patientDaoi.update(patient);
	}

	
	@Override
	public void updateAge(Patient patient) {
		// TODO Auto-generated method stub
		System.out.println(patient.getAge()+" "+patient.getPatient_id());
		String pname= patient.getAge();
		patient = findById(patient.getPatient_id());
		patient.setAge(pname);
		System.out.println(patient.getAge()+" "+patient.getPatient_id());
		patientDaoi.update(patient);
	}

	
	@Override
	public void updateWieght(Patient patient) {
		String pname= patient.getWeight();
		patient = findById(patient.getPatient_id());
		patient.setWeight(pname);
		patientDaoi.update(patient);
	}

	
	@Override
	public void updateProblem(Patient patient) {
		String pname= patient.getProblem();
		patient = findById(patient.getPatient_id());
		patient.setProblem(pname);
		patientDaoi.update(patient);
	}

	
	@Override
	public void updateAppDate(Patient patient) {
		String pname= patient.getApp_date();
		patient = findById(patient.getPatient_id());
		patient.setApp_date(pname);
		patientDaoi.update(patient);
	}

	
	@Override
	public void updateContact(Patient patient) {
		String pname= patient.getContact();
		patient = findById(patient.getPatient_id());
		patient.setContact(pname);
		patientDaoi.update(patient);
	}

	@Override
	public void deletePatient(Patient patient) {

		patient = findById(patient.getPatient_id());
		patientDaoi.deletePatient(patient);
	}
	public Patient findById(String id) {
		// TODO Auto-generated method stub
		return patientDaoi.findById(id);
	}
		
	

}
