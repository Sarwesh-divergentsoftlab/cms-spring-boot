package com.divergentsl.cms_springboot.dao;

import com.divergentsl.cms_springboot.model.LoginAdmin;
import com.divergentsl.cms_springboot.model.LoginDoctor;

public interface LoginDaoI {
	
	boolean checkAdmin(LoginAdmin loginAdmin);
	
	boolean checkDoctor(LoginDoctor loginDoctor);
		

}
