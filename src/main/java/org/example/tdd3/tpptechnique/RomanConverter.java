package org.example.tdd3.tpptechnique;

import java.util.Map;

public class RomanConverter {

	private static final Map<Integer, String> results = Map.of(
			1, "I",
			4, "IV",
			5, "V",
			9, "IX",
			10, "X",
			40, "XL"


	);

	//10 if -> while
	public String convert(int number) {

		if(results.containsKey(number)) {
			return results.get(number);
		}

		StringBuilder result = new StringBuilder();
		while(number >= 40) {
			result.append(results.get(40));
			number -= 40;
		}

		while(number >= 10) {
			result.append(results.get(10));
			number -= 10;
		}

		while(number >= 5) {
			result.append(results.get(5));
			number -= 5;
		}

		while(number >= 1) {
			result.append(results.get(1));
			number -= 1;
		}

		return result.toString();
	}
}
