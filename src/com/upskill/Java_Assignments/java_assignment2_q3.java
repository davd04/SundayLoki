package com.upskill.Java_Assignments;

public class java_assignment2_q3 {
	
	public static int a;
	public static int b;

	public static void main(String[] args) {
		
		a = function1();
		b = function2();
		
		if (a > b){
			System.out.println("function1 is bigger than function2");			
		} else if (b > a){
			System.out.println("function2 is bigger than function1");
		}

	}
	
	public static int function1() {
		return 55;
	}
	
	public static int function2(){
		return 65;
	}
	
	

}
