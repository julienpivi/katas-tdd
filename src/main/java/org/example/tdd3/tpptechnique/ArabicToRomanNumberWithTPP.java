package org.example.tdd3.tpptechnique;

public class ArabicToRomanNumberWithTPP {

	public static String convert(int number) {
		int divided = number/10;
		int remainder = number % 10;
		StringBuilder romanNumberBuilder = new StringBuilder();

		if(divided == 1) {
			romanNumberBuilder.append("X");
		}

		if(divided == 2) {
			romanNumberBuilder.append("XX");
		}

		String[] unitRomanNumber = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		romanNumberBuilder.append(unitRomanNumber[remainder]);

		return romanNumberBuilder.toString();
	}

}
