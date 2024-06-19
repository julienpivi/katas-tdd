package org.example.tdd3.tpptechnique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArabicToRomanNumberCorrectionTest {

	@Test
	void testCase() {
		convertNumberToRoman(1, "I");
		convertNumberToRoman(2, "II");
		convertNumberToRoman(3, "III");
		convertNumberToRoman(4, "IV");
		convertNumberToRoman(5, "V");
		convertNumberToRoman(6, "VI");
		convertNumberToRoman(7, "VII");
		convertNumberToRoman(8, "VIII");
	}

	private void convertNumberToRoman(int number, String expected) {
		String romanNumeral = new RomanConverter().convert(number);
		Assertions.assertEquals(expected, romanNumeral);
	}
}
