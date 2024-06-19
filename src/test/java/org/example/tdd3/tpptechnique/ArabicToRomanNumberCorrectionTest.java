package org.example.tdd3.tpptechnique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArabicToRomanNumberCorrectionTest {

	@Test
	void testCase() {
		convertNumberToRoman(1, "I");
	}

	private void convertNumberToRoman(int number, String expected) {
		String romanNumeral = new RomanConverter().convert(number);
		Assertions.assertEquals(expected, romanNumeral);
	}
}
