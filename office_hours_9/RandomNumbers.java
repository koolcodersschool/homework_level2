package office_hours_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
	/*
	Create a class and name it RandomNumbers
	Write a method, and call it getRandomNumbersList that accepts int size, and returns list of random numbers based on the given size.
	For example if you call getRandomNumbersList and pass 100, then the method should give you 100 random numbers as a list.
	submit your code as usual.
	*/
	
	public static void main(String[] args) {
		List<Integer> list = getRandomNumbersList(50, 100);
		System.out.println(list);
	}
	
	public static List<Integer> getRandomNumbersList(int size, int randomRange){
		List<Integer> randomNumberList = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			randomNumberList.add(random.nextInt(randomRange));
		}
		
		return randomNumberList;
	}

}
