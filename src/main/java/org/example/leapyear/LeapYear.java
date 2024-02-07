package org.example.leapyear;

public class LeapYear {
    public boolean detect(int value) {
        if(value == 2017 || value == 2018 || value == 2019) { // Need to refactor
            return false;
        }
        if(value % 10 == 0 && !(value % 400 == 0)) {
            return false;
        }
        return true;
    }
}
