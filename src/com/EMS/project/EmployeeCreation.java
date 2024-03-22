package com.EMS.project;

public class EmployeeCreation {
	
	private static int random=1001;
	//creating a method name of creationEmployee and give return type of Employee
	public Employee cretaionEmployee(String name,double salary,double exp, String designation,String companyname) {
		
		//creating a object of employee class and returning object reference variable.
		Employee e1=new Employee(random++, name, salary, exp, designation, companyname);
		
		return e1;
		
	}

}
