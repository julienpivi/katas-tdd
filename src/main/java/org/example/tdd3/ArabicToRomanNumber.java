package org.example.tdd3;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumber {

	private static final Map<Integer, String> arabicUnitsToRomanUnits = new HashMap<>();
	private static final Map<Integer, String> arabicTensToRomanTens = new HashMap<>();

	static {
		arabicUnitsToRomanUnits.put(1, "I");
		arabicUnitsToRomanUnits.put(2, "II");
		arabicUnitsToRomanUnits.put(3, "III");
		arabicUnitsToRomanUnits.put(4, "IV");
		arabicUnitsToRomanUnits.put(5, "V");
		arabicUnitsToRomanUnits.put(6, "VI");
		arabicUnitsToRomanUnits.put(7, "VII");
		arabicUnitsToRomanUnits.put(8, "VIII");
		arabicUnitsToRomanUnits.put(9, "IX");

		arabicTensToRomanTens.put(10, "X");
		arabicTensToRomanTens.put(20, "XX");
		arabicTensToRomanTens.put(30, "XXX");
		arabicTensToRomanTens.put(40, "XL");
		arabicTensToRomanTens.put(50, "L");
		arabicTensToRomanTens.put(60, "LX");
		arabicTensToRomanTens.put(70, "LXX");
		arabicTensToRomanTens.put(80, "LXXX");
		arabicTensToRomanTens.put(90, "XC");
	}

	public static String convert(int number) {
		if(number/10 >= 1) {
			return arabicTensToRomanTens.get(number);
		}
		return arabicUnitsToRomanUnits.get(number);
	}
}
