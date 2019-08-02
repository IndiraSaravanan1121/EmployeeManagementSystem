package EmployeManagement;

import java.io.Serializable;

/**
 * purpose:pojo class to set and get the employee detail.
 * it use to re-use the code for n number of employee. 
 * user entered value get and set here using getter and setter method.
 */

public class Employe implements Serializable
	{
	private int userId;
	private String userName;
	private String userDesignation;
	private String userQualification;
	private double userSalary;
	private int userage;
	
	
	    public int getId() 
	    {
	    	return userId;
	    }
	    
	    public String getName()  
	    {
	    	return userName;
	    }
	    public String getDesignation() 
	    {
	    	return userDesignation;
	    }
	    public String getQualification() 
	    {
	    	 return userQualification;
	    }
	    public double getSalary() 
	    {
	    	 return userSalary;
	    }
	    public void setName(String name)  
	    {
	    	this.userName=name;
	    }
	    public void setDesignation(String designation) 
	    {
	    	this.userDesignation=designation;
	    }
	    public void setQualification(String qualification) 
	    {
	    	 this.userQualification=qualification;
	    }
	    public void setSalary(double salary) 
	    {
	    	 this.userSalary=salary;
	    }
	    public int getage(int age) 
	    {
	    	return userage;
	    }

	    
	    public void setage(int age) 
	    {
	    	 this.userage=age;
	    }
	    //remove employee details.
		public void remove(int id) 
		{
			Employe e =new Employe();
			e.remove(id);
		}

		/*public void setId(int userId2) {
			
			this.userId=userId2;
		}*/



	

}
