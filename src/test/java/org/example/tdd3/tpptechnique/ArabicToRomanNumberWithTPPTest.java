package org.example.tdd3.tpptechnique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArabicToRomanNumberWithTPPTest {

	@Test
	void zero_then_void() {
		//assert
		Assertions.assertEquals("", ArabicToRomanNumberWithTPP.convert(0));
	}

	@Test
	void one_conversion() {
		//assert
		Assertions.assertEquals("I", ArabicToRomanNumberWithTPP.convert(1));
	}

	@Test
	void two_conversion() {
		//assert
		Assertions.assertEquals("II", ArabicToRomanNumberWithTPP.convert(2));
	}

	@Test
	void three_conversion() {
		//assert
		Assertions.assertEquals("III", ArabicToRomanNumberWithTPP.convert(3));
	}

	@Test
	void four_to_nine_conversion() {
		//assert
		Assertions.assertEquals("IV", ArabicToRomanNumberWithTPP.convert(4));
		Assertions.assertEquals("V", ArabicToRomanNumberWithTPP.convert(5));
		Assertions.assertEquals("VI", ArabicToRomanNumberWithTPP.convert(6));
		Assertions.assertEquals("VII", ArabicToRomanNumberWithTPP.convert(7));
		Assertions.assertEquals("VIII", ArabicToRomanNumberWithTPP.convert(8));
		Assertions.assertEquals("IX", ArabicToRomanNumberWithTPP.convert(9));
	}

	@Test
	 void ten_conversion() {
		//assert
		Assertions.assertEquals("X", ArabicToRomanNumberWithTPP.convert(10));
	}


	@Test
	void eleven_conversion() {
		//assert
		Assertions.assertEquals("XI", ArabicToRomanNumberWithTPP.convert(11));
	}


}
