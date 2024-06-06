package org.example.tdd3.tpptechnique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArabicToRomanNumberWithTPPTest {

	@Test
	public void zero_then_null() {
		//assert
		Assertions.assertEquals(null, ArabicToRomanNumberWithTPP.convert(0));
	}

	@Test
	public void one_conversion() {
		//assert
		Assertions.assertEquals("I", ArabicToRomanNumberWithTPP.convert(1));
	}

	@Test
	public void two_conversion() {
		//assert
		Assertions.assertEquals("II", ArabicToRomanNumberWithTPP.convert(2));
	}

	@Test
	public void three_conversion() {
		//assert
		Assertions.assertEquals("III", ArabicToRomanNumberWithTPP.convert(3));
	}

	@Test
	public void four_to_nine_conversion() {
		//assert
		Assertions.assertEquals("IV", ArabicToRomanNumberWithTPP.convert(4));
		Assertions.assertEquals("V", ArabicToRomanNumberWithTPP.convert(5));
		Assertions.assertEquals("VI", ArabicToRomanNumberWithTPP.convert(6));
		Assertions.assertEquals("VII", ArabicToRomanNumberWithTPP.convert(7));
		Assertions.assertEquals("VIII", ArabicToRomanNumberWithTPP.convert(8));
		Assertions.assertEquals("IX", ArabicToRomanNumberWithTPP.convert(9));
	}




}
