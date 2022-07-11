package com.chainsys.springproject.beans;

//Multiple factory methods in one class
//Calender factory is also called as initiating bean because methods in this bean 
public class CalenderFactory {
  //the factory method is not static here
  public Calender createCalender() {
      return new Calender();
      //The calender constructor is default access modifier so, can be called here 
      //The calender class and the calender factory class 
  }
  public Appointments createAppointments() {
      return new Appointments();
  }
}