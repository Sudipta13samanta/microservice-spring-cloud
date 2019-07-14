package com.sudipta.microservice.data.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudipta.microservice.data.model.EmployeeData;

@RestController
@RequestMapping("/empdata")
public class EmployeeDataRestService {
	
	@GetMapping("/{id}")
	public EmployeeData getEmpData(@PathVariable int id) {
		return new EmployeeData(id, "CS", 1000.00);
	}

}
