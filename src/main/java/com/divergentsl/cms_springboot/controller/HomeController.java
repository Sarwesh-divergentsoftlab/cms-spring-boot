package com.divergentsl.cms_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {
	@GetMapping
	public String showIndex()
	{
		return "insertform";
	}

}
