package Java_assignment_test;

public class Java_A5_Q2 {

	public static void main(String[] args) {
		
		fizzbuzz(15);

	}
	
	public static void fizzbuzz(Integer i){
		String result = "";
		if(i%3 == 0){
			result += "Fizz";
		}
		if(i%5 == 0){
			result += "Buzz";
		}
		if(result.equals("")){
			result = i.toString();
		}
		System.out.println(result);
	}

}
