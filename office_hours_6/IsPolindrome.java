package office_hours_5;

import java.util.Iterator;

public class IsPolindrome {
	
	/*
	Create a class and name it CheckIfPolindrome
	Write a method, and name it isPolindrome, that accepts String str, and returns if that str is polindrome or not.
	Submit your code as usual.
	*/
	
	public static void main(String[] args) {
		boolean check = isPolindrome("civic");
		System.out.println(check);
	}
	
	public static boolean isPolindrome(String str) {
		boolean isPolindrome = false;
		String reversedStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reversedStr += "" + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(reversedStr)) {
			isPolindrome = true;
		}else {
			isPolindrome = false;
		}
		
		return isPolindrome;
	}

}
