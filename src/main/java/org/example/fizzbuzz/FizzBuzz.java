package org.example.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String handle(int value) {
        if(isMod3(value) && isMod5(value) == 0) {
            return FIZZ+BUZZ;
        }
        if(isMod5(value) == 0) {
            return BUZZ;
        }
        if (isMod3(value)) {
            return FIZZ;
        }
        return String.valueOf(value);
    }

    private static int isMod5(int value) {
        return value % 5;
    }

    private static boolean isMod3(int value) {
        return value % 3 == 0;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 100 ; i++) {
            System.out.println(fizzBuzz.handle(i));
        }

    }
}
