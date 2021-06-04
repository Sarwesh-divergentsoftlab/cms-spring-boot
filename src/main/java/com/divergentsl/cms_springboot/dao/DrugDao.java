package com.divergentsl.cms_springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.Drug;


@Repository
public class DrugDao implements DrugDaoI {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void insertDrug(Drug drug) {
    	em.persist(drug);
	}

	@Override
	@Transactional
	public List<Drug> showDrug() {
		// TODO Auto-generated method stub
		CriteriaQuery<Drug> criteriaQuery = em.getCriteriaBuilder().createQuery(Drug.class);
		@SuppressWarnings("unused")
		Root<Drug> root = criteriaQuery.from(Drug.class);
		return em.createQuery(criteriaQuery).getResultList();

	}

	@Override
	@Transactional
	public void update(Drug drug) {
		
    	em.persist(drug);
    	
	}

	@Override
	@Transactional
	public Drug findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Drug.class, id);
	}
}