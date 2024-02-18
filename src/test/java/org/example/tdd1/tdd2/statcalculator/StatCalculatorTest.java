package org.example.tdd1.tdd2.statcalculator;

import org.example.tdd2.statcalculator.StatCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatCalculatorTest {

	@Test
	void find_min_value_in_sequence_number_of_one_element() {

		//Arrange
		int[] sequence = {6};
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int minValue = statCalculator.findMin(sequence);

		//Assert
		Assertions.assertEquals(6, minValue);

	}

	@Test
	void find_min_value_in_sequence_number_of_two_elements() {

		//Arrange
		int[] sequence = {6,5};
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int minValue = statCalculator.findMin(sequence);

		//Assert
		Assertions.assertEquals(5, minValue);

	}

	@Test
	void find_min_value_in_sequence_number() {

		//Arrange
		int[] sequence = {6,9,15,-2,92,11};
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int minValue = statCalculator.findMin(sequence);

		//Assert
		Assertions.assertEquals(-2, minValue);

	}



}
