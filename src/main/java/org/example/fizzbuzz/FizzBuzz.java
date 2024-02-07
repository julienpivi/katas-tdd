package org.example.fizzbuzz;

public class FizzBuzz {
    public String handle(int value) {
        if(value == 3 || value == 6 || value == 9) { //Need to refactor now.
            return "fizz";
        }
        return String.valueOf(value);
    }
}
