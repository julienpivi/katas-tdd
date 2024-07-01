package org.example.tdd3.arabicroman;

import org.example.tdd3.arabicroman.tpptechnique.ArabicToRomanNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a positive integer number (eg 42) determine its Roman numeral representation as a String (eg "XLII").
 *
 * You cannot write numerals like IM for 999. Wikipedia states "Modern Roman numerals are written by expressing each arabic digit separately, starting with the leftmost digit, and skipping any digit with a value of zero."
 * For example:
 *
 * 1990 -> "MCMXC" (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")
 * 2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
 * 99 -> "XCIX" (90 -> "XC" + 9 -> "IX")
 * 47 -> "XLVII" (40 -> "XL" + 7 -> "VII")
 */

class ArabicToRomanNumberTest {

	@Test
	void units_conversion_arabic_to_roman() {
		//Assert
		Assertions.assertEquals("I", ArabicToRomanNumber.convert(1));
		//Assert
		Assertions.assertEquals("II", ArabicToRomanNumber.convert(2));
		//Assert
		Assertions.assertEquals("III", ArabicToRomanNumber.convert(3));
		//Assert
		Assertions.assertEquals("IV", ArabicToRomanNumber.convert(4));
		//Assert
		Assertions.assertEquals("V", ArabicToRomanNumber.convert(5));
		//Assert
		Assertions.assertEquals("VI", ArabicToRomanNumber.convert(6));
		//Assert
		Assertions.assertEquals("VII", ArabicToRomanNumber.convert(7));
		//Assert
		Assertions.assertEquals("VIII", ArabicToRomanNumber.convert(8));
		//Assert
		Assertions.assertEquals("IX", ArabicToRomanNumber.convert(9));
	}

	@Test
	void tens_conversion_arabic_to_roman() {
		//Assert
		Assertions.assertEquals("X", ArabicToRomanNumber.convert(10));
		//Assert
		Assertions.assertEquals("XX", ArabicToRomanNumber.convert(20));
		//Assert
		Assertions.assertEquals("XXX", ArabicToRomanNumber.convert(30));
		//Assert
		Assertions.assertEquals("XL", ArabicToRomanNumber.convert(40));
		//Assert
		Assertions.assertEquals("L", ArabicToRomanNumber.convert(50));
		//Assert
		Assertions.assertEquals("LX", ArabicToRomanNumber.convert(60));
		//Assert
		Assertions.assertEquals("LXX", ArabicToRomanNumber.convert(70));
		//Assert
		Assertions.assertEquals("LXXX", ArabicToRomanNumber.convert(80));
		//Assert
		Assertions.assertEquals("XC", ArabicToRomanNumber.convert(90));
	}

	@Test
	void cents_conversion_arabic_to_roman() {
		//Assert
		Assertions.assertEquals("C", ArabicToRomanNumber.convert(100));
		//Assert
		Assertions.assertEquals("CC", ArabicToRomanNumber.convert(200));
		//Assert
		Assertions.assertEquals("CCC", ArabicToRomanNumber.convert(300));
		//Assert
		Assertions.assertEquals("CD", ArabicToRomanNumber.convert(400));
		//Assert
		Assertions.assertEquals("D", ArabicToRomanNumber.convert(500));
		//Assert
		Assertions.assertEquals("DC", ArabicToRomanNumber.convert(600));
		//Assert
		Assertions.assertEquals("DCC", ArabicToRomanNumber.convert(700));
		//Assert
		Assertions.assertEquals("DCCC", ArabicToRomanNumber.convert(800));
		//Assert
		Assertions.assertEquals("CM", ArabicToRomanNumber.convert(900));
	}

	@Test
	void randoman_tens_units_number_conversion_arabic_to_roman() {
		//Assert
		Assertions.assertEquals("XLVII", ArabicToRomanNumber.convert(47));
		//assert
		Assertions.assertEquals("XCIX", ArabicToRomanNumber.convert(99));
		//assert
		Assertions.assertEquals("XIII", ArabicToRomanNumber.convert(13));
		//assert
		Assertions.assertEquals("LXXI", ArabicToRomanNumber.convert(71));
	}

	@Test
	void randoman_cents_tens_units_number_conversion_arabic_to_roman() {
		//Assert
		Assertions.assertEquals("CLIX", ArabicToRomanNumber.convert(159));
		//Assert
		Assertions.assertEquals("CCCXII", ArabicToRomanNumber.convert(312));
		//Assert
		Assertions.assertEquals("CDXCVII", ArabicToRomanNumber.convert(497));
		//Assert
		Assertions.assertEquals("CMLXIV", ArabicToRomanNumber.convert(964));

	}

}