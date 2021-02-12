package com.coforge.githubJavaEx.dao;

import java.util.Scanner;

import com.coforge.githubJavaEx.beanClass.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	private Employee e=null;
	Scanner sc=new Scanner(System.in);
	
	public EmployeeDaoImpl() {
		e=new Employee();
	}
	public void addEmp() {
		e=new Employee();
		e.setEmpid(sc.nextInt());
		e.setEmpname(sc.next());
		e.setPhoneno(sc.nextLong());
		e.setEmpemail(sc.next());
}

	public void displayEmp() {
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getPhoneno());
		System.out.println(e.getEmpemail());
		
		
	}
	

}
