package Java_assignment_test;

import java.util.Scanner;

public class Java_A2_Q3 {

	public static void main(String[] args) {

		
		int a = number1();
		int b= number2();
		
		if(a>b){
			System.out.println("1st number is bigger than 2nd number");
			
		} else if(a == b){
			System.out.println("1st number is the same as 2nd number");
			
		}else{
			System.out.println("2nd number is bigger than 1st number");
		}

	}
	
	public static int number1(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pick 1st number: ");
		int a = input.nextInt();
		
		return a;
		
	}
	
	public static int number2(){
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Pick 2nd number: ");
		int b = input.nextInt();

		return b;
	}

}
