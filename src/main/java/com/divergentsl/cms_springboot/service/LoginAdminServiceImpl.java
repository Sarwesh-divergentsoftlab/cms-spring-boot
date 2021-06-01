package com.divergentsl.cms_springboot.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.LoginDaoI;
import com.divergentsl.cms_springboot.model.LoginAdmin;
@Service
public class LoginAdminServiceImpl implements LoginAdminService {

	
	@Autowired 
	LoginDaoI ldi;
	
	
	@Override
	public boolean adminLogin(LoginAdmin loginAdmin) {
        //LoginAdmin lao = new LoginAdmin();
		loginAdmin.getUsername();
		loginAdmin.getPassword();
		System.out.println(loginAdmin.getPassword());
		return ldi.checkAdmin(loginAdmin);
	}

}
