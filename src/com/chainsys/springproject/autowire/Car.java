package com.chainsys.springproject.autowire;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Required; 
// import javax.annotation.Resources; // @Resources not Working.
import org.springframework.stereotype.Component;

public  class Car {
	@Autowired
	private Engine petrolEngine;
	@Autowired(required=false)
	private Wheel alloy;
	
	public void begin() {
		System.out.println("Start AnnotationLc...");
	}
	public void stop() {
		System.out.println("Stoped AnnotationLc...");
	}
	
	public Car() {
		System.out.println(" Car Object created "+ hashCode());
	}
	public void start() {
		petrolEngine.start();
	}
	public void move() {
		alloy.rotate();
	}
}
	@Component("SportsCar")
	class SportsCar extends Car
	{
		public SportsCar()
		{
			System.out.println("SportsCar Object Created  "+hashCode());
		}
	}
	@Component("SuvCar")
	class SuvCar extends Car
	{
		public SuvCar()
		{
			System.out.println("SuvCar Object Created   " +hashCode());
		}
	}
