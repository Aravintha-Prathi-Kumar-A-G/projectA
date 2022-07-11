package com.chainsys.springproject.startup;


import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.view.EmployeeController;
import com.chainsys.springproject.test.TestClasspathXml;

public class Main {

	public static void main(String[] args) {
	
	employeeMenu();
	}
	public static void employeeMenu() {
		ConfigurableApplicationContext apcontext=new ClassPathXmlApplicationContext("Employee.xml");
		EmployeeController empcontroller = apcontext.getBean(EmployeeController.class);
		Scanner sc=new Scanner(System.in);
		empcontroller.setApcontext(apcontext);
		empcontroller.setSc(sc);
		System.out.println("1.) To add New employee in to table");
		System.out.println("2.) To Get employee datails by id from table");
		System.out.println("3.) To Update employee details");
		System.out.println("4.) To Delete Employee details");
		int vCase=sc.nextInt();
		switch(vCase) {
		case 1:
			empcontroller.addNewEmployee();
			break;
		case 2:
			empcontroller.GetEmplyeeById();
			break;
		case 3:
			empcontroller.UpdateEmployee();
			break;
		case 4:
			empcontroller.DeleteEmployee();
			break;
		default:
			System.out.println("enter valid number");
		}
		apcontext.close();
		sc.close();
	
	}
}