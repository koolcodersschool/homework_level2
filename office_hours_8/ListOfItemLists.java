package office_hours_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfItemLists {
	/*
	Create a class and name it ListOfItemLists
	write a method, name it createListOfItemLists, that accepts List<String> items, int copyCount, and copies that list copyCount times, adds to another list, and returns List of those item lists.
	Submit your code as usual.
	*/
	public static void main(String[] args) {
		List<String> items = new ArrayList<>(Arrays.asList("item1", "item1", "item3"));
		List<List<String>> listOfItemLists = createListOfItemLists(items, 4);
		System.out.println(listOfItemLists);
	}
	public static List<List<String>> createListOfItemLists(List<String> items, int copyCount){
		List<List<String>> listOfItemLists = new ArrayList<>();
		for(int i = 1; i <= copyCount; i++) {
			listOfItemLists.add(items);
		}
		
		return listOfItemLists;
	}

}
