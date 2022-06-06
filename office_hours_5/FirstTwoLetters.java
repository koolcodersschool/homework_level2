package office_hours_4;

public class FirstTwoLetters {
	
	/*
	Create a class and name it FirstTwoLetters
	Write a method, name it first2Letters, which accepts String str, and returns first 2 letters of that str.
	Submit your code as usual.
	*/
	
	public static void main(String[] args) {
		String str = "Ughur";
		String first2Letter = first2Letters(str);
		System.out.println(first2Letter);
	}
	
	public static String first2Letters(String str) {
		String outPut = "";
		outPut = "" + str.charAt(0) + str.charAt(1);
		
		return outPut;
	}

}
