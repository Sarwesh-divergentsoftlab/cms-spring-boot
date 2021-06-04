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

import com.divergentsl.cms_springboot.model.Appointment;
import com.divergentsl.cms_springboot.model.Patient;
import com.divergentsl.cms_springboot.service.AppointmentService;
@RequestMapping("/appointmentOP")
@Controller
public class AppointmentContoller {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/insert")
	public String insertAppointment(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Appointment appointment = new Appointment();
		appointment.setAppointment_id(req.getParameter("id"));
		appointment.setDoctor_id(req.getParameter("did"));
		appointment.setApp_date(req.getParameter("app"));
		appointment.setTime(req.getParameter("time"));
		appointment.setPatient_id(req.getParameter("pid"));
		appointment.setProblem(req.getParameter("problem"));
		
		
		appointmentService.addAppointment(appointment);
		return null;
	}
	
	@GetMapping
	public String showAppointment()
	{
		return "insertappointment";
	}
	
}
