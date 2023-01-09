package Java_assignment_test;

public class Java_A4_Q4 {

	public static void main(String[] args) {
		
		leapyear(1997);

	}
	public static void leapyear(int year){
		boolean leap = false;
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0){
					leap = true;
				} else leap = false;
			} else leap = true;
		} else leap = true;
		
		if(leap = true){
			System.out.println("Year: " + year + " is a leap year");
		} else 
			
			System.out.println("Year: " + year + " is not a leap year");
		
	}

}
