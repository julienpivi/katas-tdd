package org.example.tdd3.tpptechnique;

public class ArabicToRomanNumberWithTPP {

	public static String convert(int number) {
		String[] romanNumber = new String[] {null, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		return romanNumber[number];
	}

}
