package org.example.tdd3.arabicroman.tpptechnique;

import java.util.Map;

public class RomanConverter {

	private static final Map<Integer, String> results = Map.of(
			40, "XL",
			10, "X",
			9, "IX",
			5, "V",
			4, "IV",
			1, "I"


	);

	//10 if -> while
	public String convert(int number) {

		StringBuilder result = new StringBuilder();

		for (Map.Entry<Integer, String> entry : results.entrySet()) {

			while(number >= entry.getKey()) {
				result.append(entry.getValue());
				number -= entry.getKey();
			}

		}


		return result.toString();
	}
}
