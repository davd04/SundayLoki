package com.upskill.java_2;

import java.util.Scanner;

public class Java_Assignment_2 {

	public static void main(String[] args) {
		
		int i = 50;
		int grade = 100;
		
		while (i>=1){
			System.out.print(i + " ");
			i--;
		}
		
	System.out.println();
	System.out.println();
		
	if(grade >= 90){
		System.out.println("Grade A");
		} 
	else if (grade >= 80 && grade <= 89) {
		System.out.println("Grade B");
	}
	else if (grade >= 70 && grade <= 79) {
		System.out.println("Grade C");
	}
	else if (grade >= 60 && grade <= 69) {
		System.out.println("Grade D");
	}
	else if (grade >= 0 && grade < 60) {
		System.out.println("Fail");
	}
	else {
		System.out.println("Invalid");
	}
	
	
    int x;
	for(x = 1; x<=500; x = x *2) {
		System.out.print(x + " ");
	}
	
	System.out.println();
	System.out.println();
	
	int m1;
	int m2;
	for(m1=1; m1<=8; m1++){
		for(m2=1; m2<=8; m2++){
			int multiplicationtable = m1 * m2;
			System.out.print(multiplicationtable + " ");
		}
		System.out.println(" ");
	}

	System.out.println();

	int a1= 0;
	int num = 0;
	String pnumbers = "";
	for(a1=1; a1<=100; a1++){
		int a2=0;
		for(num = a1; num>= 1; num--){
			if(a1%num == 0){
				a2 = a2 + 1;
			}
		}
		if(a2 == 2) {
			pnumbers = pnumbers + a1 + " ";
		}
	}
	
	System.out.println("prime numbers from 1 to 100: ");
	System.out.println(pnumbers);
	
	System.out.println();
	
	int b1;
	int b2 = 1;
	
	for(b1=1; b1<=7; b1++){
		b2 = b2 * b1;
	}
	
	System.out.println("7! = " + b2);
	
	System.out.println();
	
	double ctemp;
	double ftemp;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter temp: ");
	
	ftemp = input.nextInt();
	ctemp = (ftemp - 32)/ 1.8;
	
	System.out.println("Temp in Celsius: " + ctemp);
	}
	
}

