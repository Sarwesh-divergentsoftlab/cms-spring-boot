package com.divergentsl.cms_springboot.dao;

import java.util.List;

import com.divergentsl.cms_springboot.model.Appointment;
import com.divergentsl.cms_springboot.model.Patient;

public interface AppointmentDaoI {

List<Appointment> showAssignedAppointment(Appointment appointment);
	
	
	
	List<Appointment> patHistory(Patient patient);
	
	void addAppointment(Appointment appointment);
	
	List<Appointment>  invoice();
}
