package office_hours_2;

public class FindTheShortestWord {
	/*
	Create a class and name it FindTheShortestWord
	Create a String array and name it pokemons. Add following pokemons into that array:
	"Abra"
	"Aipom"
	"Banette" 
	"Bidoof"
	Then find the shortest pokemon name from pokemons array.
	*/
	public static void main(String[] args) {
		String[] pokemons = {"Abra", "Aipom", "Banette", "Bidoof"};
		int minimumNumber = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0; i < pokemons.length; i++) {
			if(pokemons[i].length() < minimumNumber) {
				minimumNumber = pokemons[i].length();
				index = i;
			}
		}
		System.out.println("The shortest word is: " + pokemons[index]);
	}

}
