package office_hours_2;

import java.util.Arrays;

public class ReverseByBubbleMethod {
	/*
	Create a class and name it ReverseByBubbleMethod
	Create an int array, name it numbers and add following numbers into that array:
	123
	23
	43
	54
	87
	At this point print a numbers array. It should in the consol: [123, 23, 43, 54, 87]
	Then reverse numbers array using Bubble approach.
	*/
	public static void main(String[] args) {
		int[] numbers = {123, 23, 43, 54, 87};
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
