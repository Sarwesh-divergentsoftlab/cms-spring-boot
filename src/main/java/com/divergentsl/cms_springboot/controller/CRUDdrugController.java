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
import com.divergentsl.cms_springboot.service.DrugService;
import com.divergentsl.cms_springboot.service.PatientService;

	@Controller
	@RequestMapping("CRUDdrug")
	public class CRUDdrugController {

		@Autowired
		DrugService drugService;
		
		@Autowired
		PatientService patientService;
		@PostMapping("/update")
		public String updateOption(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			Drug drug = new Drug();
			String selected = req.getParameter("option");
			String id = req.getParameter("id");
			String info = req.getParameter("info");
			drug.setDrug_id(id);
			//System.out.println(id +" "+info);
			switch(selected)
			{
			case "update name":
				drug.setName(info);
				drugService.updateDrugName(drug);
				break;
			
			case "update price":
				drug.setDrug_price(info);
				drugService.updateDrugPrice(drug);
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
			Drug drug=new Drug();
			drug.setDrug_id(req.getParameter("id"));
			drug.setDrug_price(req.getParameter("price"));
			drug.setName(req.getParameter("name"));
			drugService.insertDrug(drug);
			return null;
		}
				
		@GetMapping("/update")
		public String showUpdatePanel()
		{
			return "updatedrug";
		}
		
		@GetMapping("/insert")
		public String showinsertDrug()
		{
			
			return "insertdrug";
		}
		
		@GetMapping("/delete")
		public String showdelete()
		{
			return "deletedrug";
		}
		
		@GetMapping
		public String showCrudDrug()
		{
			return "CRUDDrug";
		}
		@GetMapping("/show")
		protected ModelAndView showPage() {
			List<Drug> alldrug = drugService.showDrug();
			ModelAndView model = new ModelAndView("showalldrug"); 
			model.addObject("alldrug", alldrug); 
			System.out.println(alldrug);
			return model;
		}
	}