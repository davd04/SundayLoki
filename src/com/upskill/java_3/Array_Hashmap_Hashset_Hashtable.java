package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {
	
	public static void main(String[] args) {
	
	// Array store multiple data using index
	
		int age = 30;
		int[] ageLoki = new int[]{25, 30, 35, 38, 40};
		
	    // Array index			  [0] [1] [2] [3] [4] 
		

		String[] nameLoki = new String[]{"David", "Jake", "Anna", "Selina", "Bob"}; 
		
		boolean[] isNY = new boolean[]{true, false, true, true, false};
		
		
		System.out.println("Student Age: " + ageLoki[4]);
		System.out.println("Total Student: " + ageLoki.length);
		System.out.println("Name: " + nameLoki[0] + "  || lives in NY: " + isNY[0]);
		System.out.println("Total names: " + nameLoki.length);
		
	
	
	// Multi Dimensional Array
	
	int [][] ageLoki2D = {{25, 30, 35, 38, 40},			//[0][0] [0][1] [0][2] [0][3] [0][4]
						  {22, 34, 47}}; 			    //[1][0] [1][1] [1][2] [1][3] 
	
	System.out.println("Age: " + ageLoki2D[1][1]);
	
	
	
	// Hashmap store multiple data using key value pair, Implementation of Map interface
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	
	Student.put("David", 25);
	Student.put("Anna", 30);
	Student.put("Selina", 38);
	
	System.out.println("HashMap Age: " + Student.get("David"));
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	Capital.put("NY","Albany");
	Capital.put("California", "Sacramento"); 
	Capital.put("Texas", "Austin");
	
	System.out.println("HashMap Country: " + Capital.get("Texas"));
	
	
	
	//Hashset store unordered collection containing unique value, Implementation of set interface
	//No duplicate values 
	
	HashSet<String> car = new HashSet<String>();
	car.add("Honda");
	car.add("BMW");
	car.add("Audi");
	car.add("Lexus");
	
	System.out.println("Car: " + car);
	
	
	
	//HashTable store multiple data using key value pair, but is synchronized (only one thread can be modified
	
	Hashtable<String, String> Region = new Hashtable<String, String>();
	Region.put("BD", "Asia");
	Region.put("USA", "America");
	
	System.out.println("Region: " + Region.get("BD"));

	
	String [][] city2d = {{"BK", "SI", "BX", "Queens"},
	                      {"LA", "Austin", "Atlanta"}};
	
	System.out.println("City: " + city2d[0][2]);
	
	
	
	}
	
}
	

