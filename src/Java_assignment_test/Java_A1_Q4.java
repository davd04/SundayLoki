package Java_assignment_test;

public class Java_A1_Q4 {

	public static void main(String[] args) {
		
		int a = firstnum();
		int b = secondnum();
		int c = b-a;
		
		System.out.println("Subtraction: " + c);
	}
	
	public static int firstnum(){
		return 30;
	}
	
	public static int secondnum(){
		return 50;
	}

}
