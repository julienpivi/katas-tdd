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

    @Test
    void when_fizzbuzz1_then() {
        //prepare
        int value  = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //act
        String fizzBuzzValue = fizzBuzz.handle(value);
        //assert
        Assertions.assertEquals("1", fizzBuzzValue);
    }

    @Test
    void when_fizzbuzz2_then() {
        //prepare
        int value  = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //act
        String fizzBuzzValue = fizzBuzz.handle(value);
        //assert
        Assertions.assertEquals("2", fizzBuzzValue);
    }

    @Test
    void when_fizzbuzz4_then() {
        //prepare
        int value  = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //act
        String fizzBuzzValue = fizzBuzz.handle(value);
        //assert
        Assertions.assertEquals("4", fizzBuzzValue);
    }
}
