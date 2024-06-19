package org.example.tdd3.tpptechnique;

import java.util.Map;

public class RomanConverter {

	private static Map<Integer, String> results = Map.of(
			1, "I",
			2, "II",
			3, "III",
			4, "IV"
	);

	//8 array -> collection
	public String convert(int number) {
		return results.get(number);
	}
}
