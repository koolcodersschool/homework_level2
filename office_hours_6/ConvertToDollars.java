package office_hours_6;

public class ConvertToDollars {
	
	/*
	Create a class and name it ConvertToDollars
	write a method and name it convertToDollars, that accepts double cents, converts it to dollars and returns double dollar
	submit your code as usual.
	*/
	
	public static void main(String[] args) {
		double cents = 100;
		
		double dollars = convertToDollars(cents);
		System.out.println(dollars);
	}
	
	public static double convertToDollars(double cents) {
		double dollars = 0;
		dollars = cents / 100;
		return dollars;
	}

}
