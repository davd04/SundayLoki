package com.upskill.java_4;

public class Encapsulation {
	
	private String name = "upskill";
	private int ssn = 123456;
	private String username = "upskill acc";
	
	//setter Method, write data
	public void setName(String value){
		name = value;
	}
	
	//Getter Method, read data
	public String getName(){
		return name;
	}
	
	public void setSsn(int number){
		ssn = number;
	}
	
	public String getUsername(){
		return username;
	}
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("David");
		System.out.println(obj.getName());
		
		obj.setSsn(4444);
		
		System.out.println(obj.getUsername());

	}

}
