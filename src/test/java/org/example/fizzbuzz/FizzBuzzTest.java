package org.example.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Rule
 * Write a function that takes numbers from 1 to 100 and outputs them as a string,
 * but for multiples of 3, it returns Fizz instead of number, and for multiple of 5, it returns Buzz.
 * For numbers that are multiples of both 3 and 5, it returns FizzBuzz.
 */
class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void when_fizzbuzz_not_multiple_of_3_and_5_then() {
        runFor(1, "1");
        runFor(2, "2");
        runFor(4, "4");
    }

    @Test
    void when_fizzbuzz_multiple_of_3_then() {
        runFor(3, "fizz");
        runFor(6, "fizz");
        runFor(9, "fizz");
    }

    @Test
    void when_fizzbuzz_multiple_of_5_then() {
        runFor(5, "buzz");
        runFor(10, "buzz");
        runFor(20, "buzz");
    }


    @Test
    void when_fizzbuzz_multiple_of_3_and_5_then() {
        runFor(15, "fizzbuzz");
        runFor(30, "fizzbuzz");
    }




    private void runFor(int valueToTest, String expectedValue) {
        //act
        String fizzBuzzValue = fizzBuzz.handle(valueToTest);
        //assert
        Assertions.assertEquals(expectedValue, fizzBuzzValue);
    }
}
