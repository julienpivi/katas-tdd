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
    void when_fizzbuzz1_then() {
        //prepare
        runFor(1, "1");
    }

    @Test
    void when_fizzbuzz2_then() {
        //prepare
        runFor(2, "2");
    }

    @Test
    void when_fizzbuzz4_then() {
        //prepare
        runFor(4, "4");
    }

    @Test
    void when_fizzbuzz3_then() {
        runFor(3, "fizz");
    }

    private void runFor(int valueToTest, String expectedValue) {
        //act
        String fizzBuzzValue = fizzBuzz.handle(valueToTest);
        //assert
        Assertions.assertEquals(expectedValue, fizzBuzzValue);
    }
}
