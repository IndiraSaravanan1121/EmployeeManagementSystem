package EmployeManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


 /**
  *purpose:create employee detail using map.
  *employee details:name,id,designation,qualification,salary and age.
  *using map,map object is created to store particular employee detail in list.
  */
public class EmployeeDetails 
	{
	Scanner sc=new Scanner(System.in);
	private int userId;
	private String userName;
	private String userDesignation;
	private String userQualification;
	private double userSalary;
	private int userAge;
	public Map<Integer, Employe> getDetails(Map<Integer,Employe> empl) 
	{
		Map<Integer,Employe> m=new HashMap<Integer,Employe>();
		Employe emp=new Employe();
		
		System.out.println("enter the name");
		userName=sc.next();
		//emp.setName(userName);
		//emp.getName();
		
		System.out.println("enter the position");
		userDesignation=sc.next();
		//emp.setDesignation(userDesignation);
		//emp.getDesignation();
		
		System.out.println("enter the qualification");
		userQualification=sc.next();
		//emp.setQualification(userQualification);
		//emp.getQualification();
		
		System.out.println("enter the salary");
		userSalary=sc.nextDouble();
		//emp.setSalary(userSalary);
		//emp.getSalary();
		
		System.out.println("enter the age");
		//userAge=sc.nextInt();
		//emp.setage(userAge);
		
		System.out.println("enter the id");
		userId=sc.nextInt();
		//emp.setId(userId);
		m.put(userId, emp);
		return m;
	
	
		
		}
	
	  
	
	

}
