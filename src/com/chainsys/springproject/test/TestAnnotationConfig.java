package com.chainsys.springproject.test;

import com.chainsys.springproject.appconfig.AppConfig;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.component.MobilePhone;

import org.springframework.context.ApplicationContext; //Parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext; //Child

public class TestAnnotationConfig {
    public static void testA() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp=ac.getBean(Employee.class);
        emp.setId(7);
        emp.setName("Aravind");
        emp.print();
        Employee emp2=ac.getBean(Employee.class);
    }
    
    public static void testPhone()
    {
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
    	ac.scan("com.chainsys.springproject.component");
    	ac.refresh();
    	MobilePhone phone = ac.getBean(MobilePhone.class);
    	phone.setPhoneNumber(9344325598l);
    	long number=phone.getPhoneNumber();
        System.out.println("Phone Number : "+number);
      }
    }
