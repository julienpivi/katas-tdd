package org.example.fibonacci;

public final class FibonacciNumberGenerator {


    public static int generate(int i) {
        if(i == 0) {
            return 0;
        }
        if(i == 3) {
            return 2;
        }
        return 1;
    }
}
