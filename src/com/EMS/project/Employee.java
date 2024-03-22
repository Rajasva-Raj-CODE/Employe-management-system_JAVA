package com.EMS.project;

public class Employee {
	
	private final int id;
	private String name;
	private double salary;
	private double exp;
	private String designtion;
	private String Companyname;
	
	public Employee(int id, String name, double salary, double exp, String designtion, String companyname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.designtion = designtion;
		Companyname = companyname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public String getDesigntion() {
		return designtion;
	}

	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public int getId() {
		return id;
	}
	
	

}
