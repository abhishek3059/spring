package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Company;
import com.model.Employee;

@RestController
public class EmployeeRestController {
	@Autowired
	private Company company ;
	

		@GetMapping("/employees")
	 	public  List<Employee> getAllEmployees() 
	    {
	       return company.getEmpList();  
	     }


		public Company getCompany() {
			return company;
		}


		public void setCompany(Company company) {
			this.company = company;
		}
	     
}
