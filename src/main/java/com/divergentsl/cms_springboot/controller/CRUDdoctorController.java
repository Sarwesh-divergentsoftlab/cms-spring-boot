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

import com.divergentsl.cms_springboot.model.Doctor;
import com.divergentsl.cms_springboot.service.DoctorService;
@RequestMapping("/CRUDdoctor")
@Controller
public class CRUDdoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/update")
	public String updateOption(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Doctor doctor = new Doctor();
		String selected = req.getParameter("option");
		String id = req.getParameter("id");
		String info = req.getParameter("info");
		doctor.setDoctor_id(id);
		//System.out.println(id +" "+info);
		switch(selected)
		{
		case "update name":
			System.out.println("enter id to updated name");
			doctor.setName(info);
			doctorService.updateName(doctor);
			break;
		
		case "update specialization":
			doctor.setSpecializatio(info);
			doctorService.updateSpecialization(doctor);
			break;
		
		case "update fees":
			doctor.setFees(info);
			doctorService.updateFees(doctor);
			break;
		
		case "update degree":
			doctor.setDegree(info);
			doctorService.updateDegree(doctor);
			break;
		
		case "update prescription":	
			doctor.setPrescription(info);
			doctorService.updatePrescription(doctor);
		
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
		Doctor doctor = new Doctor();
		doctor.setName(req.getParameter("name"));
		doctor.setDegree(req.getParameter("degree"));
		doctor.setDoctor_id(req.getParameter("id"));
		doctor.setFees(req.getParameter("fees"));
		doctor.setPrescription(req.getParameter("prescription"));
		doctor.setSpecializatio(req.getParameter("specialization"));
		doctorService.insertDoctor(doctor);
		return null;
	}
	
	@PostMapping("/delete")
	public String deleteDoctor(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		Doctor doctor = new Doctor();
		doctor.setDoctor_id(req.getParameter("id"));
		doctorService.remove(doctor);
		return null;
	}
	
	@GetMapping("/update")
	public String showUpdatePanel()
	{
		return "updatedoctor";
	}
	
	@GetMapping("/insert")
	public String showinsertDoctor()
	{
		return "insertdoctor";
	}
	
	@GetMapping("/delete")
	public String showdelete()
	{
		return "deletedoctor";
	}
	
	@GetMapping
	public String showCrudDoctor()
	{
		return "CRUDDoctor";
	}
	@GetMapping("/show")
	protected ModelAndView showPage() {
	//	log.debug("inside showPage");
		List<Doctor> allpatient = doctorService.show();
		ModelAndView model = new ModelAndView("showalldoctor"); 
		model.addObject("alldoctor", allpatient); 
		System.out.println(allpatient);
		return model;
	}
}
