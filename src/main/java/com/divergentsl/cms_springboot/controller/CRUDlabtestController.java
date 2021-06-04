package com.divergentsl.cms_springboot.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.divergentsl.cms_springboot.model.Drug;
import com.divergentsl.cms_springboot.model.Labtest;
import com.divergentsl.cms_springboot.service.LabtestService;
import com.divergentsl.cms_springboot.service.PatientService;

	@Controller
	@RequestMapping("CRUDlabtest")
	public class CRUDlabtestController {

		@Autowired
		LabtestService labtestSevice;
		
		@Autowired
		PatientService patientService;
		@PostMapping("/update")
		public String updateOption(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			Labtest labtest = new Labtest();
			String selected = req.getParameter("option");
			String id = req.getParameter("id");
			String info = req.getParameter("info");
			labtest.setLabtest_id(id);
			//System.out.println(id +" "+info);
			switch(selected)
			{
			case "update name":
				labtest.setName(info);
				labtestSevice.updateName(labtest);
				break;
			
			case "update price":
				labtest.setLabtest_price(info);
				labtestSevice.updatePrice(labtest);
				break;
			default:
				System.out.println("Enter Valid choice");
				break;
			}
		return null;
		}
		
		@PostMapping("/insert")
		public String insertDoctor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			Labtest labtest = new Labtest();
			labtest.setLabtest_id(req.getParameter("id"));
			labtest.setLabtest_price(req.getParameter("price"));
			labtest.setName(req.getParameter("name"));
			labtestSevice.insertLabtest(labtest);
			return null;
		}
				
		@GetMapping("/update")
		public String showUpdatePanel()
		{
			return "updatelabtest";
		}
		
		@GetMapping("/insert")
		public String showinsertDrug()
		{
			
			return "insertlabtest";
		}
		
		@GetMapping("/delete")
		public String showdelete()
		{
			return "deletelabtest";
		}
		
		@GetMapping
		public String showCrudDrug()
		{
			return "CRUDLabtest";
		}
		@GetMapping("/show")
		protected ModelAndView showPage() {
			List<Labtest> alllabtest = labtestSevice.showLabtest();
			ModelAndView model = new ModelAndView("showalllabtest"); 
			model.addObject("alllabtest", alllabtest); 
			System.out.println(alllabtest);
			return model;
		}
	}