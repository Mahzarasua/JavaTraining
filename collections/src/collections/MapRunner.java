package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. " + "This has never happened before.";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();
		for (char character : characters) {
			// Get the character
			Integer integer = occurances.get(character);
			// if it is not there initialize to 1
			if (integer == null)
				occurances.put(character, 1);
			// if it is there we increament the count
			else
				occurances.put(character, integer + 1);

		}
		System.out.println(occurances);

		Map<String, Integer> strOccurances = new HashMap<>();

		String[] words = str.split(" ");
		for (String word : words) {
			// Get the character
			Integer integer = strOccurances.get(word);
			// if it is not there initialize to 1
			if (integer == null)
				strOccurances.put(word, 1);
			// if it is there we increament the count
			else
				strOccurances.put(word, integer + 1);

		}
		System.out.println(strOccurances);
	}

}
