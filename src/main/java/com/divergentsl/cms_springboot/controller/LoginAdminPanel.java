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

import com.divergentsl.cms_springboot.model.LoginAdmin;
import com.divergentsl.cms_springboot.service.LoginAdminService;

@RequestMapping("/loginadmin")
@Controller
public class LoginAdminPanel {
	@Autowired
	LoginAdminService loginAdminService;

	@PostMapping
	public String checkAdmin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String username = req.getParameter("userId");
		String password = req.getParameter("password");
		System.out.println(username+" "+password);
		LoginAdmin loginAdmin = new LoginAdmin();
		loginAdmin.setUsername(username);
		loginAdmin.setPassword(password);
		boolean flag=loginAdminService.adminLogin(loginAdmin);
		if(flag)
		{
				
				return "adminPanel";
		}
		if(!false)
		{
			System.out.println("your password or username may be incorrect\n");
			
		}
		return "admin";

		
	}
	
	@GetMapping
	public String showAdminLogin()
	{
		return "admin";
	}

}
