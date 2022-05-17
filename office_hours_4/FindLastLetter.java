package office_hours_4;

public class FindLastLetter {
	
	/*
	Create a class and name it FindLastLetter
	Write a method, name it findLastLetter, which accepts String str as parameter, and returns last letter of that str.
	Test the method inside main method.
	For example:
	String str = "Banu";
	String lastLetter = findLastChar(str);
	System.out.println(lastLetter); --> u
	Submit your code as usual
	*/
	
	public static void main(String[] args) {
		String str = "Mesut";
		String lastLetter = findLastLetter(str);
		System.out.println(lastLetter);
	}
	
	public static String findLastLetter(String str) {
		String outPut = "";
		outPut = "" + str.charAt(str.length() - 1);
		return outPut;
	}

}
