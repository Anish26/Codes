package workout_program;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurences_Collections {

	public static void main(String[] args) {
		// Declare a words in String
		String str = "I am getting better every day";
		// Convert String to Char Array
		char[] charArray = str.toCharArray();
		System.out.println("The Given String is : " + str);
		Map<Character, Integer> charCounter = new TreeMap<Character, Integer>();
		for (char i : charArray) {
		charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) +1);
		}
		for (Character key : charCounter.keySet()) {
			System.out.println("occurence of '" + key + "' is "+charCounter.get(key));
		}
		

	}

}
