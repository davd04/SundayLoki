package BootCamp_2022;

public class bootcamp_Java {
	
	int salary = 4550;

	public static void main(String[] args){
		
		income e = new income();
		System.out.println("Yearly: " + e.yearly);
		System.out.println("Monthly: " + e.monthly);
		
		
	}
		
}


class income extends bootcamp_Java{
	
	int yearly = 12 * salary;
	int monthly = 4 * salary;

}