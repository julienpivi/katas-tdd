package org.example.tdd1.fibonacci;

import org.example.tdd1.fibonacci.FibonacciNumberGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciNumberGeneratorTest {

    @Test
    void when_first_index_asked_then_zero(){
        int fibonacciNumber  = FibonacciNumberGenerator.generate(0);
        Assertions.assertEquals(0, fibonacciNumber);
    }

    @Test
    void when_second_index_asked_then_one() {
        int fibonacciNumber  = FibonacciNumberGenerator.generate(1);
        Assertions.assertEquals(1, fibonacciNumber);
    }

    @Test
    void when_third_index_asked_then_one(){
        int fibonacciNumber  = FibonacciNumberGenerator.generate(2);
        Assertions.assertEquals(1, fibonacciNumber);
    }

    @Test
    void when_fourth_index_asked_then_two(){
        int fibonacciNumber  = FibonacciNumberGenerator.generate(3);
        Assertions.assertEquals(2, fibonacciNumber);
    }

    @Test
    void when_fifth_index_asked_then_three(){
        int fibonacciNumber  = FibonacciNumberGenerator.generate(4);
        Assertions.assertEquals(3, fibonacciNumber);
    }

    @Test
    void when_ten_index_asked_then_thirty_four(){
        int fibonacciNumber  = FibonacciNumberGenerator.generate(9);
        Assertions.assertEquals(34, fibonacciNumber);
    }
}
