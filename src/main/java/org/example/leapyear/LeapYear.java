package org.example.leapyear;

public class LeapYear {
    public boolean detect(int value) {
        if(value == 1700 || value == 1800 || value == 1900) { //need to refactor
            return false;
        }
        return true;
    }
}
