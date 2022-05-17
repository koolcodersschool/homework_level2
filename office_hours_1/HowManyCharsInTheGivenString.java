package office_hours_1;

public class HowManyCharsInTheGivenString {
	/**
    Create a class and name it 
    HowManyCharsInGivenString
    Given a character for example "o"
    Write a program which finds how many times "o" appears in the given String.
	Let's say given char myChar = 'o';
	given sentences is: "We are kool coders";
	Your program should print: "There are 3 [o] in the <We are kool coders>"
    */
	public static void main(String[] args) {
		
		String str = "o";
		String sentence = "We are kool coders";
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == str.charAt(0)) {
				count++;
			}
		}
		
		System.out.println("count = " + count);
		System.out.println("There are " + count + " [" + str + "] " + "in the <" +sentence +">");
		
		
		
	}

}
