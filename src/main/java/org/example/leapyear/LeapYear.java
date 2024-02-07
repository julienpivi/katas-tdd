package org.example.leapyear;

import java.util.Scanner;

public class LeapYear {
    public boolean detect(int value) {
        if(!(value % 4  == 0)) {
            return false;
        }
        if(value % 10 == 0 && !(value % 400 == 0)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeapYear leapYear = new LeapYear();

        while(true) {
            int year = scanner.nextInt();
            if(leapYear.detect(year)) {
                System.out.println("It's a leap year");
            } else {
                System.out.println("It's not a leap year");
            }
        }

    }
}
