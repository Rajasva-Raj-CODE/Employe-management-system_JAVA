package com.EMS.project;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		
		EmployeeCreation ec=new EmployeeCreation();
		
		Employee e1=ec.cretaionEmployee("Raj", 50000.00, 3.0,"SSE","JSpider");
		Employee e2=ec.cretaionEmployee("Rohan", 550000.00, 3.3,"SSE","JSpider");
		Employee e3=ec.cretaionEmployee("Tejasvi", 350000.00, 3.7,"SSE","JSpider");
		Employee e4=ec.cretaionEmployee("Rahul", 650000.00, 3.8,"SE","JSpider");
		Employee e5=ec.cretaionEmployee("Abhay", 750000.00, 6.3,"ASE","JSpider");
		
		//Creating employee database of capacity 10
		
		EmployeeDB eDB =  new EmployeeDB(10);

		//storing employee in database
		
		eDB.addEmployee(e1);
		eDB.addEmployee(e2);
		eDB.addEmployee(e3);
		eDB.addEmployee(e4);
		eDB.addEmployee(e5);
		eDB.viewFullDatabase();
		
		System.out.println("total Employee:"+eDB.getEmployeeCount());
		
		eDB.viewFullDatabase();
		
		System.out.println();
		
		Employee e= eDB.searchEmployee(1005);
		System.out.println(e.getId()+" "+e.getName());
		eDB.updateSalary(1003, 5000.00);
		eDB.viewFullDatabase();
		eDB.deletedEmployee(1003);
		eDB.viewFullDatabase();
		System.out.println("Total Employee:"+eDB.getEmployeeCount());
		
		System.out.println("---------------------------------------------------");

	}

}
