package org.example.leapyear;

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
}
