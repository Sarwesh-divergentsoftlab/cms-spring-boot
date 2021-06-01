package com.divergentsl.cms_springboot.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.divergentsl.cms_springboot.dao.PatientDao;
import com.divergentsl.cms_springboot.dao.PatientDaoI;
import com.divergentsl.cms_springboot.model.Patient;
@Service
public class PatientServiceImpl implements PatientService{

//	@Autowired
//	private PatientDaoI patientDaoi;
	
	PatientDaoI patientDaoi = new PatientDao();
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void insertPatient(Patient patient) {
		
		// TODO Auto-generated method stub
		System.out.println("enter patient name");
		String name = sc.next();
		System.out.println("enter patient age");
		String patient_age= sc.next();
		System.out.println("enter patient id");
		String patient_id= sc.next();
		System.out.println("enter patient weight");
		String weight=sc.next();
		System.out.println("enter patient problem");
		String problem=sc.next();
		System.out.println("enter application date");
		String app_date=sc.next();
		System.out.println("enter patient contact number");
		String contact=sc.next();
		patient.setAge(patient_age);
		patient.setApp_date(app_date);
		patient.setContact(contact);
		patient.setName(name);
		patient.setPatient_id(patient_id);
		patient.setProblem(problem);
		patient.setWeight(weight);
		patientDaoi.insertPatient(patient);
	}

	@Override
	public List<Patient> showPatient() {
		// TODO Auto-generated method stub
		return patientDaoi.showPatient();
	}

	
	public void updateName(Patient patient) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated patient name");
        String name=sc.next();
		patient = findById(id);
		patient.setPatient_id(id);
		patient.setName(name);
		patientDaoi.update(patient);
	}

	
	public void updateAge(Patient patient) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated age");
        String name=sc.next();
		patient = findById(id);
		patient.setAge(id);
		patient.setName(name);
		patientDaoi.update(patient);
	}

	
	public void updateWieght(Patient patient) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated drug name");
        String name=sc.next();
		patient = findById(id);
		patient.setPatient_id(id);
		patient.setWeight(name);
		patientDaoi.update(patient);
	}

	
	public void updateProblem(Patient patient) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated drug name");
        String name=sc.next();
		patient = findById(id);
		patient.setPatient_id(id);
		patient.setProblem(name);
		patientDaoi.update(patient);
	}

	
	public void updateAppDate(Patient patient) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated drug name");
        String name=sc.next();
		patient = findById(id);
		patient.setPatient_id(id);
		patient.setApp_date(name);
		patientDaoi.update(patient);
	}

	
	public void updateContact(Patient patient) {
		// TODO Auto-generated method stub
		String id = sc.next();
        System.out.println("enter updated drug name");
        String name=sc.next();
		patient = findById(id);
		patient.setPatient_id(id);
		patient.setContact(name);
		patientDaoi.update(patient);
	}

	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		System.out.println("enter doctor id to delete");
		String id=sc.next();
		patient = findById(id);
		patient.setPatient_id(id);
		
		patientDaoi.deletePatient(patient);
	}
	public Patient findById(String id) {
		// TODO Auto-generated method stub
		return patientDaoi.findById(id);
	}

	@Override
	public void updatePanel(Patient patient) {
		// TODO Auto-generated method stub
		System.out.println("enter choice");
		System.out.println("press 1 : to update name");
		System.out.println("press 2 : to update age");
		System.out.println("press 3 : to update weight");
		System.out.println("press 4 : to update problem");
		System.out.println("press 5 : to update Application date");
		String n=sc.next();
			switch(n)
			{
			case "1":
				System.out.println("enter patient id to update name");
				
				//patientDao= new PatientDao(new DatabaseManager());
				updateName(new Patient());
				//if(rowupdatename>0) System.out.print("information updated\n");
				
				break;
			
			case "2":
		
				System.out.println("enter patient id to update age");
				//patientDao= new PatientDao(new DatabaseManager());
				updateAge(new Patient());
				//if(rowupdatespec>0) System.out.print("information updated\n");
				break;
			
			case "3":
				
				System.out.println("enter patient id to update wieght");
				//patientDao= new PatientDao(new DatabaseManager());
				updateWieght(new Patient());
				//if(rowupdatefees>0) System.out.print("information updated\n");
				
				break;
			
			case "4":
				
				System.out.println("enter patient id to update problem");
				
				//patientDao= new PatientDao(new DatabaseManager());
				updateProblem(new Patient());
				//if(rowupdatedegree>0) System.out.print("information updated\n");
				
				break;
			
			case "5":	
				
				System.out.println("enter patient id to update app date");
				String pdate=sc.next();
				//patientDao= new PatientDao(new DatabaseManager());
				updateAppDate(new Patient());
				//if(rowupdate>0) System.out.print("information updated\n");
				
				break;
			
			case "6":	
				
				System.out.println("enter patient id to update contact");
				//patientDao= new PatientDao(new DatabaseManager());
				updateContact(new Patient());
				//if(rowupdatec>0) System.out.print("information updated\n");
				break;
			
			default:
				System.out.println("Enter Valid choice");
			}
		
	}

}
