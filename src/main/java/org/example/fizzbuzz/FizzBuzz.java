package org.example.fizzbuzz;

public class FizzBuzz {
    public String handle(int value) {
        if(value == 3 || value == 6) {
            return "fizz";
        }
        return String.valueOf(value);
    }
}
