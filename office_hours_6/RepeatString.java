package office_hours_5;

public class RepeatString {
	/*
	Create a class, and name it RepeatString

	Write a method, name it repeatString that accepts String word, int num, char delimeter as parameter
	method should repeat the word num of times and should put delimeter after each word repeated.
	For example:
	repeatString("koolcoders", 3, '%')  -->> koolcoders%koolcoders%koolcoders%

	*/
	
	public static void main(String[] args) {
		repeatString("koolcoders", 3, '%');
	}
	
	public static void repeatString(String word, int num, char delimiter){

        for (int i = 0; i < num; i++) {
            System.out.print(word + delimiter);
        }
        System.out.println();
    }

}
