package BootCamp_2022;

public class test2 {

	public static void main(String[] args) {
		
		reverse("yes");

	}

	public static void reverse(String a){
		
		byte[] strarray = a.getBytes();
		byte[] result = new byte[strarray.length];
		
		for(int i=0; i<strarray.length;i++){
			result[i] = strarray[strarray.length-i-1];
		}
		
		System.out.println("reverse word: " + new String(result));
	}

}
