package com.divergentsl.cms_springboot.service;

import com.divergentsl.cms_springboot.model.Appointment;
import com.divergentsl.cms_springboot.model.Patient;


public interface AppointmentService {
	
	void showAssignedAppointment(Appointment appointment);
	
	void addPrescription(Patient patient);
	
	void patHistory(Patient patient);
	
	void addAppointment(Appointment appointment);
	
	void  invoice();

}
