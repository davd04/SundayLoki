package Java_assignment_test;

public class Java_A2_Q2 {

	public static void main(String[] args) {
		
		grade(99);

	}
	
	public static void grade(int a){

		
		if(a >= 90) {
			System.out.println("Grade A");
		} else if (a >= 80) {
			System.out.println("Grade B");
		} else if (a >= 70){
			System.out.println("Grade C");
		} else if (a >= 60 ) {
			System.out.println("Grade D");      
		} else if (a < 60){
			System.out.println("Fail");
		} else {
			System.out.println("Invalid");
		}
	}

}
