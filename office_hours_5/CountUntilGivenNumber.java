package office_hours_4;

public class CountUntilGivenNumber {
	
	/*
	Create a class and name it CountUntilGivenNumber
	Write a method, name it  countUntilGivenNumber, which accepts int endCount, and prints numbers until given number.
	Submit your code as usual.
	*/

	public static void main(String[] args) {
		countUntilGivenNumber(10);
	}
	
	public static void countUntilGivenNumber(int endCount) {
		for(int i = 0; i <= endCount; i++) {
			System.out.println(i);
		}
	}
}
