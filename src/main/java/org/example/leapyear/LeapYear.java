package org.example.leapyear;

public class LeapYear {
    public boolean detect(int value) {
        if(value % 10 == 0 && !(value % 400 == 0)) { //need to refactor
            return false;
        }
        return true;
    }
}
