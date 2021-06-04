package com.divergentsl.cms_springboot.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.AppointmentDaoI;
import com.divergentsl.cms_springboot.dao.PatientDaoI;
import com.divergentsl.cms_springboot.model.Appointment;
import com.divergentsl.cms_springboot.model.Patient;
@Service
public class AppointmentServiceImpl implements AppointmentService {

	
	@Autowired
	private AppointmentDaoI appointmentDao;
	
	@Autowired
	PatientDaoI patientDaoi;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void showAssignedAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		 System.out.println(appointmentDao.showAssignedAppointment(appointment));
	}

	@Override
	public void addPrescription(Patient appointment) {
		// TODO Auto-generated method stub
		System.out.println("enter patient id to prescribe");
		String id = sc.next();
        System.out.println("enter prescription and notes");
        String name=sc.next();
		appointment = findById(id);
		appointment.setPatient_id(id);
		appointment.setPrescription(name);
		patientDaoi.update(appointment);
		
	}
	public Patient findById(String id) {
		// TODO Auto-generated method stub
		return patientDaoi.findById(id);
	}

	@Override
	public void patHistory(Patient patient) {
		// TODO Auto-generated method stub
		 System.out.println(appointmentDao.patHistory(patient));
	}

	@Override
	public void addAppointment(Appointment appointment) {
		appointmentDao.addAppointment(appointment);
	}

	@Override
	public void invoice() {
		// TODO Auto-generated method stub
		 appointmentDao.invoice();
	}

}
