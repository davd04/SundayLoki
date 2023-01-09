package Java_assignment_test;

public class Java_A4_Q1 {
	
	private String username = "dd";
	private String password = "12345";
	private String email = "dd04@gmail.com";
	private String firstname = "David";
	private String lastname = "D";
	
	void display(){
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("email: " + email);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		
	}

	public static void main(String[] args) {
		
		Java_A4_Q1 e = new Java_A4_Q1();
		e.display();

	}

}
