package org.example.tdd3.tpptechnique;

public class ArabicToRomanNumberWithTPP {

	public static String convert(int number) {
		if(number == 1) {
			return "I";
		}
		if(number == 2) {
			return "II";
		}
		return null;
	}

}
