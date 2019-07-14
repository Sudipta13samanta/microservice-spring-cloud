package com.sudipta.microservice.info.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sudipta.microservice.info.model.Employee;
import com.sudipta.microservice.info.model.EmployeeData;

@RestController
@RequestMapping("/emp")
public class EmployeeInfoRestService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		EmployeeData data = restTemplate.getForObject("http://localhost:8092/empdata/"+11, EmployeeData.class);
		return new Employee(id , "Sudipta", data);
	}

}
