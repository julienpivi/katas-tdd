package org.example.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

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
}
