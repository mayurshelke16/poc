package com.neosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Employee;
import com.neosoft.model.Employeedto;
import com.neosoft.repos.EmpRepos;

@Service
public class EmpserviceImp implements EmpService {

	
	@Autowired
	private EmpRepos empRepos;
	
	   public Employee adddetails(Employee employee) {
	  
	 
	 return empRepos.save(employee); }
	 

	@Override
	 public Employee adddetails(Employeedto employee) {
	//	 Employee employee2= employee.getEmployeedto();
		 
		//modify
		 Employee emp= new Employee();
		 emp.setM1(employee.getM1());
		 emp.setM2(employee.getM2());
		 double sum=emp.getM1()+emp.getM2();
		 emp.setAvg(sum/2);
		 
		 if(emp.getAvg()>=3)
		 {
			 emp.setGrade("A(good)");
		 }else
			 if(emp.getAvg()<=3)
			 {
				 emp.setGrade("B(Bad)");
			 }
			 
		 
		 
		 
		  
		 return empRepos.save(emp); }
	 

}
