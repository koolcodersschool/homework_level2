package office_hours_5;

public class AgeFinder {
	
	/*
	Create a class, and name it AgeFinder
	Write a method, and name it ageFinder, that accepts int birthYear, and calculates age based on birthYear and currentYear, and returns age.
	You should handle invalid ages too.

	Submit your code as usual.
	*/
	
	public static void main(String[] args) {
		printAge(2023);
	}
	
	public static void printAge(int birthYear){
        int currentYear = 2022;
        if (birthYear < 0 || birthYear > currentYear){
            System.out.println("Birth Year is not valid");
        }else{
            System.out.println(currentYear - birthYear);
        }
    }

}
