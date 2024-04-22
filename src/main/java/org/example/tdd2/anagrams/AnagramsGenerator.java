package org.example.tdd2.anagrams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramsGenerator {

	public static List<String> generate(String expectedString) {
		if(expectedString == null || expectedString.isEmpty()) {
			return List.of("");
		}
		if(expectedString.length() == 1) {
			return List.of(expectedString);
		}

		Set<String> anagrams = new HashSet<>();
		anagrams.add(expectedString);

		for (int i = 0; i < expectedString.length(); i++) {
			char[] charArray = expectedString.toCharArray();
			String compare = "";
			while (!compare.equals(expectedString)) {
				for (int j = 0; j < charArray.length; j++) {
					if(j == charArray.length - 1) {
						char char1 = charArray[j];
						char char2 = charArray[0];
						charArray[j] = char2;
						charArray[0] = char1;
					} else {
						char char1 = charArray[j];
						char char2 = charArray[j + 1];
						charArray[j] = char2;
						charArray[j + 1] = char1;
					}
					compare = new String(charArray);
					anagrams.add(compare);
				}
			}
		}

		return new ArrayList<>(anagrams);
	}
}
