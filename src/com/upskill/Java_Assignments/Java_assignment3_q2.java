package com.upskill.Java_Assignments;

public class Java_assignment3_q2 {

	static int count = 1;
	Java_assignment3_q2(String name, int age, int salary, String address) {
		System.out.println("Employee number: " + count);
		System.out.println("Employee name: " + name);
		System.out.println("Employee age: " + age);
		System.out.println("Employee salary: " + salary);
		System.out.println("Employee address: " + address);
		count++;
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Java_assignment3_q2[] obj = new Java_assignment3_q2[5];
		obj[0] = new Java_assignment3_q2("David", 25, 150000, "SI");
		obj[1] = new Java_assignment3_q2("Selina", 24, 122000, "BK");
		obj[2] = new Java_assignment3_q2("Bob", 36, 95000, "Queens");
		obj[3] = new Java_assignment3_q2("Anna", 32, 105000, "BX");
		obj[4] = new Java_assignment3_q2("Mary", 19, 46000, "Texas");

	}

}
