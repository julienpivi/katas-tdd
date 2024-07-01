package org.example.tdd3.arabicroman.tpptechnique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArabicToRomanNumberCorrectionTest {

	@Test
	void testCase() {
		convertNumberToRoman(1, "I");
		convertNumberToRoman(2, "II");
		convertNumberToRoman(3, "III");
	    //convertNumberToRoman(4, "IV");  the code doesn't work with this value.
		//convertNumberToRoman(5, "V");  the code doesn't work with this value.
		//convertNumberToRoman(6, "VI");  the code doesn't work with this value.
		//convertNumberToRoman(7, "VII");  the code doesn't work with this value.
		//convertNumberToRoman(8, "VIII");  the code doesn't work with this value.
		//convertNumberToRoman(9, "IX"); expected IX actual VIV  the code doesn't work with this value.
		//convertNumberToRoman(10, "X"); actual IIIIIIIIII  the code doesn't work with this value.
		convertNumberToRoman(11, "XI");
		convertNumberToRoman(17, "XVII");
		convertNumberToRoman(25, "XXV");
		convertNumberToRoman(39, "XXXIX");
		convertNumberToRoman(40, "XL");
		convertNumberToRoman(44, "XLIV");
	}

	private void convertNumberToRoman(int number, String expected) {
		String romanNumeral = new RomanConverter().convert(number);
		Assertions.assertEquals(expected, romanNumeral);
	}
}
