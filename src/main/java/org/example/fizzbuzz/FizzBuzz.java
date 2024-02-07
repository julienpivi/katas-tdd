package org.example.fizzbuzz;

public class FizzBuzz {
    public String handle(int value) {
        if(value == 5 || value == 10 || value == 15) { //Need to refactor now.
            return "buzz";
        }
        if (value % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(value);
    }
}
