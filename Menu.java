package EmployeManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.naming.NamingException;

///import EmpDet.DeleteEmp;

public class Menu {
	Map<Integer, Employe> m = new HashMap<Integer, Employe>();
	Scanner sc = new Scanner(System.in);

	/**
	 * purpose:login page to authenticate the user. end user need to provide
	 * userName and password. if userName and password match,it enter into menu
	 * method if not it exist from the loop
	 */

	void loginPage() {
		String userName;
		String password;
		System.out.println("LOGIN PAGE");
		System.out.println("Enter user name"); //enter user name as indira
		userName = sc.next();
		System.out.println("Enter password"); //enter password as indira3
		password = sc.next();
		if (userName.equals("indira") & password.equals("indira3")) {
			System.out.println("login successfully");
			menu();
		} else {
			System.out.println("Invalid username and password");
			loginPage();
		}
	}
	
	/**
	 * purpose:Its show menu to do modification in employee details.
	 * End user need to choose option to perform.
	 * Based on the user input,switch do the operation. 
	 */

	public void menu() {
		int id;
		do {
			System.out.println("Employee Management System ");
			System.out.println("---------------------------");
			System.out.println("1.Create Employee Detail");
			System.out.println("2.Fetch Employee Detail");
			System.out.println("3.Delete Employee Detail");
			System.out.println("4.Exit");
			System.out.println("Choose an option from menu");
			int option = sc.nextInt();
			switch (option) {
			
            //create employee detail 
			case 1:
				EmployeeDetails emplydetail = new EmployeeDetails();
				m = emplydetail.getDetails(m);
				break;
				
			//fetch employee detail
			case 2:
                
				System.out.println("Please enter id to get detail of employee");
				id = sc.nextInt();
				fetch fet = new fetch(m);
				break;
				
            //delete employee detail    				
			case 3:
				System.out.println("Please enter id to delete detail of employee");
				id = sc.nextInt();
				break;
				
			//exit from menu
			case 4:
				System.out.println("Exit...");
				break;
				
            //switch case execute default if user entered value is not match with the menu.
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (true);
	}

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.loginPage();

	}
}
