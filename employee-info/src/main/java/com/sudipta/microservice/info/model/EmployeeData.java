package com.sudipta.microservice.info.model;

public class EmployeeData {
	
	private int id;
	private String dept;
	private double sal;
	
	public EmployeeData(int id, String dept, double sal) {
		super();
		this.id = id;
		this.dept = dept;
		this.sal = sal;
	}

	public EmployeeData() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
