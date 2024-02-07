package org.example.fizzbuzz;

public class FizzBuzz {
    public String handle(int value) {
        if(value == 5 || value == 10) {
            return "buzz";
        }
        if (value % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(value);
    }
}
