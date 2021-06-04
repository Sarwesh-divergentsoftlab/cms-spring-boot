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

import com.divergentsl.cms_springboot.model.Patient;
import com.divergentsl.cms_springboot.service.PatientService;

@RequestMapping("/CRUDpatient")
@Controller
public class CRUDpatientController {

	@Autowired
	PatientService patientService;
	@PostMapping("/update")
	public String updateOption(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Patient patient = new Patient();
		String selected = req.getParameter("option");
		String id = req.getParameter("id");
		String info = req.getParameter("info");
		patient.setPatient_id(id);
		//System.out.println(id +" "+info);
		switch(selected)
		{
		case "update name":
			patient.setName(info);
			patientService.updateName(patient);
			break;
		
		case "update age":
			patient.setAge(info);
			patientService.updateAge(patient);
			break;
		
		case "update weight":
			
			patient.setWeight(info);
			patientService.updateWieght(patient);
			break;
		
		case "update problem":
			
			patient.setProblem(info);
			patientService.updateProblem(patient);
			break;
		case "update Application Date":	
			patient.setApp_date(info);
			patientService.updateAppDate(patient);
			break;
		
		case "update contact":	
			patient.setContact(info);
			patientService.updateContact(patient);
			break;
		
		default:
			System.out.println("Enter Valid choice");
			break;
		}
	return null;
	}
	
	@PostMapping("/insert")
	public String insertPatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Patient patient = new Patient();
		patient.setAge(req.getParameter("age"));
		patient.setApp_date(req.getParameter("app"));
		patient.setContact(req.getParameter("contact"));
		patient.setName(req.getParameter("name"));
		patient.setPatient_id(req.getParameter("id"));
		patient.setProblem(req.getParameter("problem"));
		patient.setWeight(req.getParameter("weig"));
		
		
		patientService.insertPatient(patient);
		return null;
	}
	
	@PostMapping("/delete")
	public String deletePatient(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		Patient patient = new Patient();
		patient.setPatient_id(req.getParameter("id"));
		
		patientService.deletePatient(patient);
		return null;
	}
	
	@GetMapping("/update")
	public String showUpdatePanel()
	{
		return "updatepatient";
	}
	
	@GetMapping("/insert")
	public String showinsertPatient()
	{
		return "insertpatient";
	}
	
	@GetMapping("/delete")
	public String showdelete()
	{
		return "deletepatient";
	}
	
	@GetMapping
	public String showCrudPatient()
	{
		return "CRUDPatient";
	}
	@GetMapping("/show")
	protected ModelAndView showPage() {
		List<Patient> allpatient = patientService.showPatient();
		ModelAndView model = new ModelAndView("showallpatient"); 
		model.addObject("allpatient", allpatient); 
		System.out.println(allpatient);
		return model;
	}
}
