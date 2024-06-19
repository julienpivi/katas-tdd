package org.example.tdd3.tpptechnique;

import java.util.Map;

public class RomanConverter {

	private static final Map<Integer, String> results = Map.of(
			1, "I",
			4, "IV",
			5, "V",
			6, "VI",
			7, "VII",
			8, "VIII"
	);

	//9 statement -> tail recursion
	public String convert(int number) {

		if(results.containsKey(number)) {
			return results.get(number);
		}

		return results.get(1) + convert(number - 1);
	}
}
