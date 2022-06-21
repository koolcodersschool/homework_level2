package office_hours_6;

public class GiveMeShapes {
	
	/*
	Create a class and name it GiveMeShapes
	write a method, and name it getShapes, that accepts int sides, and returns shape name
	submit your code as usual.
	*/
	
	public static void main(String[] args) {
		int sides = 5;
		String shape = getShapes(sides);
		System.out.println(shape);
	}
	
	public static String getShapes(int sides) {
		String shape = "";
		switch(sides) {
			case 3:
				shape = "triangle";
				break;
			case 4:
				shape = "square";
				break;
			case 5:
				shape = "pentagon";
				break;
			case 6: 
				shape = "hexagon";
				break;
			case 8:
				shape = "octagon";
				break;
			case 9:
				shape = "nonagon";
				break;
			case 10:
				shape = "decagon";
				break;
			default:
				System.out.println("There is NOT such a shape in our database: " + shape);
		}
		
		return shape;
	}

}
