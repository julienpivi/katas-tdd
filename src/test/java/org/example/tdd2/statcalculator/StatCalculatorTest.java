package org.example.tdd2.statcalculator;

import org.example.tdd2.statcalculator.StatCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatCalculatorTest {

	@Test
	void find_min_value_in_sequence_number_all_the_same() {

		//Arrange
		int[] sequence = {5,5,5,5,5,5};
		int expectedValue = 5;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int minValue = statCalculator.findMin(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, minValue);

	}

	@Test
	void find_min_value_in_sequence_number_whole_negative() {

		//Arrange
		int[] sequence = {-10,-9,-35,-2,-5,-11};
		int expectedValue = -35;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int minValue = statCalculator.findMin(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, minValue);

	}

	@Test
	void find_min_value_in_sequence_number() {

		//Arrange
		int[] sequence = {6,9,15,-2,92,11};
		int expectedValue = -2;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int minValue = statCalculator.findMin(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, minValue);

	}


	@Test
	void find_max_value_in_sequence_number() {
		//Arrange
		int[] sequence = {6,9,15,-2,92,11};
		int expectedValue = 92;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int actualValue = statCalculator.findMax(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, actualValue );
	}

	@Test
	void find_max_value_in_sequence_number_whole_negative() {
		//Arrange
		int[] sequence = {-10,-9,-35,-2,-5,-11};
		int expectedValue = -2;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int actualValue = statCalculator.findMax(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, actualValue );
	}

	@Test
	void find_max_value_in_sequence_number_all_the_same() {
		//Arrange
		int[] sequence = {5,5,5,5,5,5};
		int expectedValue = 5;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int actualValue = statCalculator.findMax(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, actualValue );
	}

	@Test
	void find_number_element_in_a_sequence() {
		//Arrange
		int[] sequence = {6,9,15,-2,92,11};
		int expectedValue = 6;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		int actualValue = statCalculator.numberOfElement(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, actualValue);
	}

	@Test
	void find_average_value_in_a_sequence() {
		//Arrange
		int[] sequence = {6,9,15,-2,92,11};
		double expectedValue = 21.833;
		StatCalculator statCalculator = new StatCalculator();

		//Act
		double actualValue = statCalculator.averageValue(sequence);

		//Assert
		Assertions.assertEquals(expectedValue, actualValue, 0.001);
	}
}
