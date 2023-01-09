package com.upskill.java_4;

import com.upskill.java_1.MethodTypes;

public class Polymorphism extends MethodTypes {

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.annualIncomevoid();
		
		car(4, "Bugatti");

	}
	
	//Method overriding
	
	public void annualIncomevoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int bonus = 20000;
		int rentalincome = 10000;
		int sideincome = 20000;
		int newincome = calculateAnnualIncome + bonus + rentalincome + sideincome;
		System.out.println("My Annual Income = " + newincome);
	}
	
	
	
	//Method overloading
	
	public static void car() {
		System.out.println("My car is an Audi");
	}
	
	public static void car(int door){
		System.out.println("My car is an Audi, number of doors: " + door);
	}
	
	public static void car(String color){
		System.out.println("My car is an Audi, color of car: " + color);
	}
	
	public static void car(int wheel, String brand){
		System.out.println("My car brand: " + brand + " || number of wheels: " + wheel);
	}

}
