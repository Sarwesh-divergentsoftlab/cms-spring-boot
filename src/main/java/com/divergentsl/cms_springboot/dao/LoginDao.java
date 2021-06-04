package com.divergentsl.cms_springboot.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.divergentsl.cms_springboot.model.LoginAdmin;
import com.divergentsl.cms_springboot.model.LoginDoctor;

@Repository
public class LoginDao implements LoginDaoI {
	@PersistenceContext
	private EntityManager em;
//	@Autowired
//	LoginAdmin loginAdmin1;
	LoginAdmin looginAdmin1= new LoginAdmin();
	LoginDoctor loginDoctor1= new LoginDoctor();
	
//	

	@Override
	public boolean checkAdmin(LoginAdmin loginAdmin) {
		// TODO Auto-generated method stub
	
		
		loginAdmin.getUsername();
		loginAdmin.getPassword();
		looginAdmin1=em.find(LoginAdmin.class, loginAdmin.getUsername());
		System.out.println();
//		System.out.println(loa.getUsername()+" "+loa.getPassword()+" "+loa1.getUsername()+" "+loa1.getPassword());
		if(loginAdmin.getUsername().equals(looginAdmin1.getUsername()) && loginAdmin.getPassword().equals(looginAdmin1.getPassword()))
		{
			System.out.println("login success");
			return true;
		}
		
		
	


		return false;
	}

@Override
public boolean checkDoctor(LoginDoctor loginDoctor) {
	// TODO Auto-generated method stub
	try {
	loginDoctor1= em.find(LoginDoctor.class, loginDoctor.getUsername());
	if(loginDoctor.getUsername().equals(loginDoctor1.getUsername()) && loginDoctor.getPassword().equals(loginDoctor1.getPassword()))
	{
	return true;
	}
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception occur");
	}
	return false;
}

}
