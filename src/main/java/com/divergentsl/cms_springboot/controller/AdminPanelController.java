package com.divergentsl.cms_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("adminOp")
@Controller
public class AdminPanelController {
	
	@GetMapping
	public String adminOp()
	{
		return "adminPanel";
	}
	
}
