package com.EMS.project;

public class EmployeeDB {
	//creating private array access only the same class
	private Employee[]emparr;
	//using array for 
	private int index=0;
	private int empCount=0;
	//creating parameterise constructor to giving a size for storage
	public EmployeeDB(int size) {
		emparr=new Employee[size];
	}
/**
 * this method is used to add employee details into the database
 * @param e should be Employee type
 * @return return true if added successfully else return false DB is full
 */
	public boolean addEmployee(Employee e) {
		if(index<emparr.length) {
			emparr[index++]=e;
			System.out.println("Employee details added to DB");
			empCount++;
			return true;
		}
		else {
			System.out.println("Database is full");
			return false;
		}
	}
	/**
	 * this method prints all the details of the employee
	 */
	
	public void viewFullDatabase() {
		System.out.println("----------------------------------------------------------");
		System.out.println("ID\tName\tSalary\tExp\tDesignation\tCompanyName");
		System.out.println("-----------------------------------------------------------");
		
		for(Employee emp : emparr) {
			if(emp !=null) {
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp()+"\t"
			                                                     +emp.getDesigntion()+"\t"+emp.getCompanyname());
			}
		}
	}
	
	/**
	 * this method used to get total employee in database
	 * @return return int value representing total employees
	 */
	
	public int getEmployeeCount() {
		return empCount;
	}
	/**
	 * this is method is used to search employee based on id,
	 * @param id of the employee to be searched 
	 * @return return reference to found employee otherwise return null
	 */

	public Employee searchEmployee(int id) {
		Employee e=null;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i] !=null && emparr[i].getId()==id) {
				System.out.println("Employee found in database");
				e=emparr[i];
			}
		}
		if(e==null) {
			System.out.println("Employee is not found in database");
		}
		return e;
	}
	/**
	 * this method is used to update the salary of the employee. If Employee is found
	 * database it will update salary of the employee by the specified amount
	 * @param id- employee id whose salary to be updated
	 * @param amount - amount to be added to salary
	 * @return true - if update is success
	 *         false - if update is failed
	 */
	
	public boolean updateSalary(int id,double amount) {
		Employee e= searchEmployee(id);
		if(e !=null) {
			e.setSalary(e.getSalary()+amount);
			System.out.println("Salary updated");
			return true;
		}
		else {
			System.out.println("unable to update check your employee id");
			return false;
		}
	}
	
	/**
	 * this method is used to delete employee details from database
	 * It delete the complete employee details if the record is found in database
	 * @param id of the employee to be deleted 
	 * @return true- if employee is success
	 *         false- id employee is failed
	 */
	
	public boolean deletedEmployee(int id) {
		boolean isDeleted=false;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i] !=null && emparr[i].getId()==id) {
				System.out.println("Employee found in database and deleted");
				emparr[i]=null;
				isDeleted=true;
				empCount--;
			}
		}
		if(isDeleted==false) {
			System.out.println("Employee is not found in database");
		}
		return isDeleted;
		}
	}
	
	



