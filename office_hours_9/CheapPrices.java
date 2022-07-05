package office_hours_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheapPrices {
	
	/*
	Create a class and name it CheapPrices
	Write a method and name it findCheapPrices, that accepts list of prices, and int priceLimit, and returns list of cheap prices which are less than priceLimit.
	For example given listOfprices = [3.4, 6.6, 99.99, 102,3, 5,6] and priceLimit = 10
	method should return list of prices which less 10, so output should be [3.4, 6.6, 5,6]
	submit your code as usual
	*/
	public static void main(String[] args) {
		List<Double> prices = new ArrayList<>();
		prices.add(34.99);
		prices.add(109.99);
		prices.add(200.00);
		prices.add(1000.99);
		prices.add(55.29);
		prices.add(27.89);
		prices.add(56.99);
		List<Double> cheapPrices = findCheapPrices(prices, 50);
		System.out.println(cheapPrices);
		
		
	}
	
	public static List<Double> findCheapPrices(List<Double> prices, int priceLimit){
		List<Double> cheapPrices = new ArrayList<>();
		for(Double eachPrice: prices) {
			if(eachPrice <= priceLimit) {
				cheapPrices.add(eachPrice);
			}
		}
		
		return cheapPrices;
	}

}
