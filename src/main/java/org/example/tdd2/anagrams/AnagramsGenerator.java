package org.example.tdd2.anagrams;

import java.util.ArrayList;
import java.util.List;

public class AnagramsGenerator {
	public static List<String> generate(String expectedString) {
		if(expectedString == null || expectedString.isEmpty()) {
			return List.of("");
		}
		if(expectedString.length() == 1) {
			return List.of(expectedString);
		}

		List<String> anagrams = new ArrayList<>();
		anagrams.add(expectedString);

		char[] charArray = expectedString.toCharArray();

		char[] newString = new char[] {charArray[1], charArray[0]};
		anagrams.add(new String(newString));

		return anagrams;
	}
}
