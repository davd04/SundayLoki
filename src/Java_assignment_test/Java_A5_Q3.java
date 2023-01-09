package Java_assignment_test;

public class Java_A5_Q3 {

	public static void main(String[] args) {
		
		Java_A5_Q3 obj = new Java_A5_Q3();
		boolean a = obj.isPalindrome("racecar");
		
		if(a == true){
			System.out.println("Is palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
		

	}
	public boolean isPalindrome(String word){
		int i1=0;
		int i2 = word.length() - 1;
		
		while(i2>i1){
			if(word.charAt(i1) != word.charAt(i2)){
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}

}
