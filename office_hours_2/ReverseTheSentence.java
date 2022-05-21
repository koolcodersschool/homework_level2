package office_hours_2;

public class ReverseTheSentence {
	/*
	Create a class and name it ReverseTheSentence
	Create a String sentence variable and assign the following sentence to it:
	"Hey love Java because we are koolcoders"
	Then reverse the sentence. The output should be: koolcoders are we because Java love Hey
	*/
	public static void main(String[] args) {
		String sentence = "Hey love Java because we are koolcoders";
		String[] wordsArray = sentence.split(" ");
		String outPut = "";
		for(int i = wordsArray.length - 1; i >= 0; i--) {
			outPut += wordsArray[i] + " ";
		}
		System.out.println("outPut = " + outPut);
	}

}
