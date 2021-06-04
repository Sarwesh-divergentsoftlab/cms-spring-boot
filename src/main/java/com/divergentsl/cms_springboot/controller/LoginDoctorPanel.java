package com.divergentsl.cms_springboot.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divergentsl.cms_springboot.model.LoginDoctor;
import com.divergentsl.cms_springboot.service.LoginDoctorService;


@RequestMapping("/logindoctor")
@Controller
public class LoginDoctorPanel {
	@Autowired
	LoginDoctorService loginDoctorService;
	
	@PostMapping
	public String checkDoctor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String username = req.getParameter("userId");
		String password = req.getParameter("password");
		System.out.println(username+" "+password);
		LoginDoctor loginDoctor = new LoginDoctor();
		loginDoctor.setUsername(username);
		loginDoctor.setPassword(password);
		 boolean f=loginDoctorService.doctorLogin(loginDoctor);
		    if(f)
		     {
		     
		    	System.out.println("login success");
		    	System.out.println("login as "+loginDoctor.getUsername());
		    	//doctorPanel.doctorPanel(doc);
		    	return "doctorPanel";
		     }
		    else
		    {
		    	 System.out.println("login doctor fail");
		    	 return "doctor";
		    }
		    
	}
	@GetMapping
	public String showDoctorLogin()
	{
		return "doctor";
	}
		
}


