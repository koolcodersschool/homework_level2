package office_hours_6;

public class CovertToHours {
	
	/*
	Create a class and name it CovertToHours
	write a method and name it covertToHours, that accepts int minutes, converts it to hours and returns int hours
	submit your code as usual.
	*/
	
	public static void main(String[] args) {
		double minutes = 160;
		double hours = convertToHours(minutes);
		System.out.println(hours);
	}
	
	public static double convertToHours(double minutes) {
		double hours = 0;
		hours = minutes / 60;
		return hours;
	}

}
