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

	//9 statement -> tail recursion
	public String convert(int number) {

		if(results.containsKey(number)) {
			return results.get(number);
		}

		if(number > 40) {
			return results.get(40) + convert(number - 40);
		}

		if(number > 10) {
			return results.get(10) + convert(number - 10);
		}

		if(number > 5) {
			return results.get(5) + convert(number - 5);
		}

		return results.get(1) + convert(number - 1);
	}
}
