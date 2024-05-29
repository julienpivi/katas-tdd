package org.example.tdd3;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumber {

	private static final Map<Integer, String> arabicDigitToRomanDigit = new HashMap<>();

	static {
		arabicDigitToRomanDigit.put(1, "I");
		arabicDigitToRomanDigit.put(2, "II");
		arabicDigitToRomanDigit.put(3, "III");
		arabicDigitToRomanDigit.put(4, "IV");
		arabicDigitToRomanDigit.put(5, "V");
		arabicDigitToRomanDigit.put(6, "VI");
		arabicDigitToRomanDigit.put(7, "VII");
		arabicDigitToRomanDigit.put(8, "VIII");
		arabicDigitToRomanDigit.put(9, "IX");
	}

	public static String convert(int number) {
		return arabicDigitToRomanDigit.get(number);
	}
}
