package office_hours_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAverage {
	/*
	Create a class and name it FindAverage
	write a method that accepts List<Integer> numbers, finds average of those numbers and returns int averageNumber.
	submit your code as usual.
	*/
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,7,3,2,1));
		int average = findAverageNumber(numbers);
		System.out.println(average);
	}
	public static int findAverageNumber(List<Integer> numbers) {
		int averageNumber = 0;
		int sum = 0;
		for(Integer each: numbers) {
			sum += each;
		}
		averageNumber = sum / numbers.size();
		
		return averageNumber;
	}

}
