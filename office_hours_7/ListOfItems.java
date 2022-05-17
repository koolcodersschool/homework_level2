package office_hours_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfItems {
	/*
	Create a class and name it BookShelf
	write a method, name bookshelf, that accepts String[] books, int rowNumber, int columnNumber, returns String[][] bookshelf. Method gets books and puts them inside the shelf based on rowNumber and columnNumber.
	submit your code as usual.
	*/
	public static void main(String[] args) {
		List<String> books = new ArrayList<>(Arrays.asList("book1", "book2", "book3"));
		List<String> noteBooks = new ArrayList<>(Arrays.asList("notebook1", "notebook2", "notebook3"));
		List<List<String>> bookShelf = listOfItems(books, noteBooks);
		System.out.println(bookShelf);
	}
	public static List<List<String>> listOfItems(List<String> books, List<String> noteBooks){
		List<List<String>> listOfItems = new ArrayList<>();
		listOfItems.add(books);
		listOfItems.add(noteBooks);
		
		return listOfItems;
	}

}
