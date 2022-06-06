package office_hours_4;

public class ReverseString {
	
	/*
	Create a class and name it ReverseString
	Write a method, name it reverseString, which accepts String str as a parameter, and returns reversed String.
	Test the method inside main method.
	Submit your code as usual.
	*/
	public static void main(String[] args) {
		String str = "Fatima";
		String reverse = reverseString(str);
		System.out.println(reverse);
	}
	
	public static String reverseString(String str) {
		String outPut = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			outPut += str.charAt(i);
		}
		
		return outPut;
	}

}
