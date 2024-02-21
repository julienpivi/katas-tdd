package org.example.tdd2.anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Write a program to generate all potential anagrams of an input string.
 *
 */
class AnagramsGeneratorTest {


	@Test
	void when_my_string_is_null_then_return_empty() {
		//arrange
		String expectedString = null;

		//act
		String actualString = AnagramsGenerator.generate(expectedString);

		//assert
		Assertions.assertEquals(expectedString, actualString);
	}

	@Test
	void when_my_string_is_empty_then_return_empty() {
		//arrange
		String expectedString = "";

		//act
		String actualString = AnagramsGenerator.generate(expectedString);

		//assert
		Assertions.assertEquals(expectedString, actualString);
	}


}
