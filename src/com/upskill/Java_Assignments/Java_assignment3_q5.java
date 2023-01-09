package com.upskill.Java_Assignments;

public class Java_assignment3_q5 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=50; i++){
			if (i%3==0 && i%5==0){
				System.out.println("Dingdong");
			} else if(i%3 == 0){
				System.out.println("Ding");
			} else if(i%5 == 0){
				System.out.println("Dong");
			} else {
				System.out.println(i);
			}
		}

	}

}
