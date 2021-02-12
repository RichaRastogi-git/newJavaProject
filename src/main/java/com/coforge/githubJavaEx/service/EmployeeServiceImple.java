package com.coforge.githubJavaEx.service;

//import com.coforge.githubJavaEx.dao.EmployeeDao;
import com.coforge.githubJavaEx.dao.EmployeeDaoImpl;

public class EmployeeServiceImple implements EmployeeService {

	private EmployeeDaoImpl ed=null;
	
	public EmployeeServiceImple() {
		ed=new EmployeeDaoImpl();
	}
	
	public void addEmp() {
		ed.addEmp();
		
	}

	public void displayEmp() {
		ed.displayEmp();
		
	}
	
	

}
