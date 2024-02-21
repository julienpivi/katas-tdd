package org.example.tdd2.anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Write a program to generate all potential anagrams of an input string.
 *
 */
class AnagramsGeneratorTest {


	@Test
	void when_my_string_is_null_then_return_empty() {
		//arrange
		String expectedString = "";

		//act
		List<String> actualString = AnagramsGenerator.generate(null);

		//assert
		Assertions.assertEquals(1, actualString.size());
		Assertions.assertEquals(expectedString, actualString.get(0));
	}

	@Test
	void when_my_string_is_empty_then_return_empty() {
		//arrange
		String expectedString = "";

		//act
		List<String> actualString = AnagramsGenerator.generate(expectedString);

		//assert
		Assertions.assertEquals(1, actualString.size());
		Assertions.assertEquals(expectedString, actualString.get(0));
	}


	@Test
	void when_my_string_size_one_then_only_one_anagram_is_itself() {
		//arrange
		String expectedString = "a";

		//act
		List<String> actualString = AnagramsGenerator.generate(expectedString);

		//assert
		Assertions.assertEquals(1, actualString.size());
		Assertions.assertEquals(expectedString, actualString.get(0));
	}

	@Test
	void when_my_string_size_two_then_only_two_anagram() {
		//arrange
		List<String> expectedStrings = List.of("ab", "ba");
		String intialString = "ab";

		//act
		List<String> actualStrings = AnagramsGenerator.generate(intialString);

		//assert
		Assertions.assertEquals(expectedStrings.size(), actualStrings.size());
		Assertions.assertTrue(expectedStrings.containsAll(actualStrings));
	}


}
