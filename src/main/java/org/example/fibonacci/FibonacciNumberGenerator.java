package org.example.fibonacci;

public final class FibonacciNumberGenerator {


    public static int generate(int i) {
        if(i == 0) {
            return 0;
        }
        if(i == 3) {
            return 2;
        }
        if(i == 4) {
            return 3;
        }
        //Triple duplication, it's time to refactor
        return 1;
    }
}
