package org.example.tdd3.tpptechnique;

public class RomanConverter {

	//6 unconditional -> conditional
	public String convert(int number) {

		String result = "I";

		if (number > 1) {
			result += "I";
		}

		if (number > 2) {
			result += "I";
		}

		return result;
	}
}
