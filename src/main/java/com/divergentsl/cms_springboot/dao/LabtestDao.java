package com.divergentsl.cms_springboot.dao;

//import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.Labtest;

//import com.divergentsl.cms.IDatabaseManager;


@Repository
public class LabtestDao implements LabtestDaoI {
	
	@PersistenceContext
    EntityManager em;
	

	@Override
	@Transactional
	public void insertLabtest(Labtest labtest) {
    	em.persist(labtest);
	}

	@Override
	@Transactional
	public List<Labtest> showLabtest() {
		// TODO Auto-generated method stub
		
		CriteriaQuery<Labtest> criteriaQuery = em.getCriteriaBuilder().createQuery(Labtest.class);
		@SuppressWarnings("unused")
		Root<Labtest> root = criteriaQuery.from(Labtest.class);
		return em.createQuery(criteriaQuery).getResultList();
		
	}

	@Override
	@Transactional
	public void update(Labtest labtest) {
    	em.persist(labtest);
    	
	}
	@Override
	public Labtest findById(String id) {
		return em.find(Labtest.class, id);
	}


}
