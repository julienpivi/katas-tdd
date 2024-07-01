package org.example.tdd3.primefactors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {


	@Test
	void prime_factors_for_2() {
		//arrange
		PrimeFactorsCalculator primeFactorsCalculator = new PrimeFactorsCalculator();

		//act
		int actualValue = primeFactorsCalculator.compute(2);

		//assert
		Assertions.assertEquals(2, actualValue);

	}

	@Test
	void prime_factors_for_3() {
		//arrange
		PrimeFactorsCalculator primeFactorsCalculator = new PrimeFactorsCalculator();

		//act
		int actualValue = primeFactorsCalculator.compute(3);

		//assert
		Assertions.assertEquals(3, actualValue);

	}

}
