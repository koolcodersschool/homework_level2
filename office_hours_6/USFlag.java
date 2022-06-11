package office_hours_5;

public class USFlag {
	
	/*
	Create a class, and name it USFlag
	Write a method that prints US Flag.
	Submit your code as usual.
	*/
	
	public static void main(String[] args) {
		displayUSFlag();
	}
	
	public static void displayUSFlag(){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }

}
