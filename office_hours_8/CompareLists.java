package office_hours_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareLists {
	/*
	Create a class and name it CompareLists
	Write a method, and name it verifyListsAreSame, that accepts 2 lists and returns true if they are equal, false if they are not equal.
	For example given 2 lists: 1- [2, 3, 4, 5, 89]   2 - [2, 3, 4, 5, 89]
	method should return true because list 1 has same number that list 2 has and list 1 has same order that list 2 has, and list 1 has same size that list 2 has.
	For example given 2 lists: 1- [89, 2, 3, 4, 5]   2 - [2, 3, 4, 5, 89]
	method should return false because list 1 has NOT same order that list 2 has.
	*/
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(45);
		list1.add(35);
		list1.add(55);
		List<Integer> list2 = new ArrayList<>();
		list2.add(45);
		list2.add(35);
		list2.add(55);
		boolean check = verifyListsAreSame(list1, list2);
		System.out.println(check);
		
		List<Integer> list3 = new ArrayList<>();
		list1.add(05);
		list1.add(35);
		list1.add(45);
		List<Integer> list4 = new ArrayList<>();
		list2.add(45);
		list2.add(35);
		list2.add(55);
		check = verifyListsAreSame(list1, list2);
		System.out.println(check);
	}
	
	public static boolean verifyListsAreSame(List<Integer> list1, List<Integer> list2) {
		boolean check = false;
		Collections.sort(list1);
		Collections.sort(list2);
		check = list1.equals(list2);		
		return check;
	}

}
