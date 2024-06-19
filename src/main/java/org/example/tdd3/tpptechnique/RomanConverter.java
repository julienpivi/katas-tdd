package org.example.tdd3.tpptechnique;

public class RomanConverter {

	private static String[] results = { "I", "II", "III", "IV"};

	//7 variable -> array
	public String convert(int number) {
		return results[number - 1];
	}
}
