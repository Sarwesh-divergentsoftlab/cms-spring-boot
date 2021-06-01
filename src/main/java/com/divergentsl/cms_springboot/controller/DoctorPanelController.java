package com.divergentsl.cms_springboot.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.divergentsl.cms_springboot.model.Patient;
import com.divergentsl.cms_springboot.service.PatientService;
import com.divergentsl.cms_springboot.service.PatientServiceImpl;


@RequestMapping("doctorOp")
@Controller
public class DoctorPanelController {
	
	PatientService pateintService = new PatientServiceImpl();
	
	
	@GetMapping
	protected ModelAndView showPage() {
	//	log.debug("inside showPage");
		List<Patient> allpatient = pateintService.showPatient();
		ModelAndView model = new ModelAndView("employee"); 
		model.addObject("allEmployees", allpatient); 
		System.out.println(allpatient);
		return model;
	}

}
