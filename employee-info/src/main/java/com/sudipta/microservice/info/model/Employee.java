package com.sudipta.microservice.info.model;

public class Employee {
	
	private int id;
	private String name;
	private EmployeeData data;
	
	public Employee(int id, String name, EmployeeData data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeData getData() {
		return data;
	}

	public void setData(EmployeeData data) {
		this.data = data;
	}
	
	
}
