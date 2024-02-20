package org.example.tdd2.statcalculator;

public class StatCalculator {
	public int findMin(int[] sequence) {
		int initialNumber = sequence[0];
		if (sequence.length > 1) {
			for (int index = 1; index < sequence.length; index++) {
				if (initialNumber > sequence[index]) {
					initialNumber = sequence[index];
				}
			}
		}
		return initialNumber;
	}

	public int findMax(int[] sequence) {
		int initialNumber = sequence[0];
		if (sequence.length > 1) {
			for (int index = 1; index < sequence.length; index++) {
				if (initialNumber < sequence[index]) {
					initialNumber = sequence[index];
				}
			}
		}
		return initialNumber;
	}
}
