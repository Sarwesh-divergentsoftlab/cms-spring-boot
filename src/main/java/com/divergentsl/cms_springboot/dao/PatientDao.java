package com.divergentsl.cms_springboot.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TableGenerator;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.Patient;




@Repository
public class PatientDao implements PatientDaoI {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	@Transactional
	public void insertPatient(Patient patient) {
    	em.persist(patient);
	}



	@Override
	@Transactional
	public void deletePatient(Patient patient) {
    	em.remove(patient);
	}

	@Override
	@Transactional
	public List<Patient> showPatient() {
		// TODO Auto-generated method stub
		
		CriteriaQuery<Patient> criteriaQuery = em.getCriteriaBuilder().createQuery(Patient.class);
		@SuppressWarnings("unused")
		Root<Patient> root = criteriaQuery.from(Patient.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	@Transactional
	public Patient findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Patient.class, id);
	}

	@Override
	@Transactional
	public void update(Patient patient) {
    	em.persist(patient);
	}
}
