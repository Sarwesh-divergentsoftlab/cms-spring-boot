package com.divergentsl.cms_springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.LoginDaoI;
import com.divergentsl.cms_springboot.model.LoginDoctor;

@Service
public class LoginDoctorServiceImpl implements LoginDoctorService {
	
	@Autowired
	LoginDaoI loginDaoi;
	@Override
	public boolean doctorLogin(LoginDoctor loginDoctor) {
		// TODO Auto-generated method stub
		loginDoctor.getUsername();
		loginDoctor.getPassword();
		return loginDaoi.checkDoctor(loginDoctor);
	}

}
