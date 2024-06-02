package org.example.tdd3;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumber {

	private static final Map<Integer, String> arabicUnitsToRomanUnits = new HashMap<>();
	private static final Map<Integer, String> arabicTensToRomanTens = new HashMap<>();
	private static final Map<Integer, String> arabicCentsToRomanCents = new HashMap<>();

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

		arabicCentsToRomanCents.put(100, "C");
		arabicCentsToRomanCents.put(200, "CC");
		arabicCentsToRomanCents.put(300, "CCC");
		arabicCentsToRomanCents.put(400, "CD");
		arabicCentsToRomanCents.put(500, "D");
		arabicCentsToRomanCents.put(600, "DC");
		arabicCentsToRomanCents.put(700, "DCC");
		arabicCentsToRomanCents.put(800, "DCCC");
		arabicCentsToRomanCents.put(900, "CM");
	}

	public static String convert(int number) {
		if (number/100 >= 1) {
			return arabicCentsToRomanCents.get(number);
		}
		if(number/10 >= 1) {
			int tens = Math.divideExact(number, 10);
			String tensRoman = arabicTensToRomanTens.get(tens * 10);
			int unit = Math.floorMod(number, 10);
			String unitRoman="";
			if(unit > 0) {
				unitRoman = arabicUnitsToRomanUnits.get(unit);
			}
			return tensRoman+unitRoman;
		}
		return arabicUnitsToRomanUnits.get(number);
	}

	public static void main(String[] args) {
		System.out.println(Math.divideExact(42, 10));
		System.out.println(Math.floorMod(44, 10));
	}
}
