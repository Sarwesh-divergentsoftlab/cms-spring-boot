package com.divergentsl.cms_springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.Doctor;

@Repository
public class DoctorDao implements DoctorDaoI {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public void insertDoctor(Doctor doctor) {
    	em.persist(doctor);
	}
	@Override
	public List<Doctor> show() {
		// TODO Auto-generated method stub
		CriteriaQuery<Doctor> criteriaQuery = em.getCriteriaBuilder().createQuery(Doctor.class);
		@SuppressWarnings("unused")
		Root<Doctor> root = criteriaQuery.from(Doctor.class);
		return em.createQuery(criteriaQuery).getResultList();
	}
	@Override
	@Transactional
	public void remove(Doctor doctor) {
    	em.remove(doctor);		
	}

	@Override
	@Transactional
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		System.out.println("in dao"+" "+doctor.getDoctor_id()+" "+doctor.getName()+""+doctor.getDegree());
		
    	em.persist(doctor);
    	
	}
	@Override
	public Doctor findById(String id) {
		// TODO Auto-generated method stub
		
		return em.find(Doctor.class, id) ;
	}
	
	
	
}
