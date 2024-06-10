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

	@Test
	void twelve_to_nineteen_conversion() {
		//assert
		Assertions.assertEquals("XII", ArabicToRomanNumberWithTPP.convert(12));
		Assertions.assertEquals("XIII", ArabicToRomanNumberWithTPP.convert(13));
		Assertions.assertEquals("XIV", ArabicToRomanNumberWithTPP.convert(14));
		Assertions.assertEquals("XV", ArabicToRomanNumberWithTPP.convert(15));
		Assertions.assertEquals("XVI", ArabicToRomanNumberWithTPP.convert(16));
		Assertions.assertEquals("XVII", ArabicToRomanNumberWithTPP.convert(17));
		Assertions.assertEquals("XVIII", ArabicToRomanNumberWithTPP.convert(18));
		Assertions.assertEquals("XIX", ArabicToRomanNumberWithTPP.convert(19));
	}

	@Test
	void twenty_conversion() {
		//assert
		Assertions.assertEquals("XX", ArabicToRomanNumberWithTPP.convert(20));
	}

	@Test
	void twenty_one_to_twenty_nine_conversion() {
		//assert
		Assertions.assertEquals("XXI", ArabicToRomanNumberWithTPP.convert(21));
		Assertions.assertEquals("XXII", ArabicToRomanNumberWithTPP.convert(22));
		Assertions.assertEquals("XXIII", ArabicToRomanNumberWithTPP.convert(23));
		Assertions.assertEquals("XXIV", ArabicToRomanNumberWithTPP.convert(24));
		Assertions.assertEquals("XXV", ArabicToRomanNumberWithTPP.convert(25));
		Assertions.assertEquals("XXVI", ArabicToRomanNumberWithTPP.convert(26));
		Assertions.assertEquals("XXVII", ArabicToRomanNumberWithTPP.convert(27));
		Assertions.assertEquals("XXVIII", ArabicToRomanNumberWithTPP.convert(28));
		Assertions.assertEquals("XXIX", ArabicToRomanNumberWithTPP.convert(29));
	}


	@Test
	void thirty_conversion() {
		//assert
		Assertions.assertEquals("XXX", ArabicToRomanNumberWithTPP.convert(30));
	}

	@Test
	void thirty_one_to_thirty_nine_conversion() {
		//assert
		Assertions.assertEquals("XXXI", ArabicToRomanNumberWithTPP.convert(31));
		Assertions.assertEquals("XXXII", ArabicToRomanNumberWithTPP.convert(32));
		Assertions.assertEquals("XXXIII", ArabicToRomanNumberWithTPP.convert(33));
		Assertions.assertEquals("XXXIV", ArabicToRomanNumberWithTPP.convert(34));
		Assertions.assertEquals("XXXV", ArabicToRomanNumberWithTPP.convert(35));
		Assertions.assertEquals("XXXVI", ArabicToRomanNumberWithTPP.convert(36));
		Assertions.assertEquals("XXXVII", ArabicToRomanNumberWithTPP.convert(37));
		Assertions.assertEquals("XXXVIII", ArabicToRomanNumberWithTPP.convert(38));
		Assertions.assertEquals("XXXIX", ArabicToRomanNumberWithTPP.convert(39));
	}


	@Test
	void random_conversion() {
		//assert
		Assertions.assertEquals("XLVI", ArabicToRomanNumberWithTPP.convert(46));
		Assertions.assertEquals("XCII", ArabicToRomanNumberWithTPP.convert(92));
		Assertions.assertEquals("LXVIII", ArabicToRomanNumberWithTPP.convert(68));
		Assertions.assertEquals("LXXI", ArabicToRomanNumberWithTPP.convert(71));
		Assertions.assertEquals("LV", ArabicToRomanNumberWithTPP.convert(55));
		Assertions.assertEquals("LXXX", ArabicToRomanNumberWithTPP.convert(80));
	}

}
