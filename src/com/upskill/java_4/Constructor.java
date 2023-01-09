package com.upskill.java_4;
	

public class Constructor {
	
	String studentname;
	int studentage;
	
	public Constructor(String name, int age){
		studentname = name;
		studentage = age;
	}
	
	public Constructor(String name){
		studentname = name;
	}
	
	public Constructor(int age){
		studentage = age;
	}

	public static void main(String[] args) {
		Constructor obj1 = new Constructor("David", 24);
		System.out.print(obj1.studentage + ", ");
		System.out.println(obj1.studentname);
		
		Constructor obj2 = new Constructor ("upskill");
		System.out.println(obj2.studentname);
		
		Constructor obj3 = new Constructor(30);
		System.out.println(obj3.studentage);
		
	}

}
