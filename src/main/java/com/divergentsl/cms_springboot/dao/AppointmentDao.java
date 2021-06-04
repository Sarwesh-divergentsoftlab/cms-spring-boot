package com.divergentsl.cms_springboot.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.Appointment;
import com.divergentsl.cms_springboot.model.Patient;

@Repository
public class AppointmentDao implements AppointmentDaoI{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Appointment> showAssignedAppointment(Appointment appointment) {
		
		return null;
	}

	@Override
	public List<Appointment> patHistory(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addAppointment(Appointment appointment) {
    	em.persist(appointment);
	}

	@Override
	public List<Appointment> invoice() {
		// TODO Auto-generated method stub
		return null;
	}

}
