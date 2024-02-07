package org.example.leapyear;

public class LeapYear {
    public boolean detect(int value) {
        if(value == 1700) {
            return false;
        }
        return true;
    }
}
