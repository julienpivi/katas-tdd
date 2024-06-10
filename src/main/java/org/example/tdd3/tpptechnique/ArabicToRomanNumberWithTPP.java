package org.example.tdd3.tpptechnique;

public class ArabicToRomanNumberWithTPP {

	public static String convert(int number) {
		int divided = number/10;
		int remainder = number % 10;
		StringBuilder romanNumberBuilder = new StringBuilder();
		String[] tenRomanNumber = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] unitRomanNumber = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

		if(divided > 0) {
			romanNumberBuilder.append(tenRomanNumber[divided]);
		}
		romanNumberBuilder.append(unitRomanNumber[remainder]);

		return romanNumberBuilder.toString();
	}

}
