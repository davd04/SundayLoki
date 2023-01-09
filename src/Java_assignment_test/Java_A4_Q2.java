package Java_assignment_test;

public class Java_A4_Q2 {
	
	

	public static void main(String[] args) {
	
		reverseString("whats");

	}
	
	public static void reverseString(String input) {
		
		byte[] strAsByteArray = input.getBytes();
		
		byte[] result = new byte[strAsByteArray.length];
		
		for(int i=0; i<strAsByteArray.length; i++){
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];
			
		}
		
		System.out.print(new String(result));
		
	}

}
