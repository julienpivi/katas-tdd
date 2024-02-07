package org.example.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * User Story:
 * As a user, I want to know if a year is a leap year, So that I can plan for an extra day
 * on February 29th during those years.
 * Acceptance Criteria:
 * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
 * All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800,
 * and 1900 were NOT leap years, NOR will 2100 be a leap year),
 * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
 */
class LeapYearTest {


    @Test
    void when_year_divisible_by_400_then_leap_years() {
        assertTrueFor(1600);
        assertTrueFor(2000);
        assertTrueFor(4000);
    }

    @Test
    void when_year_divide_by_100_and_not_by_400_then_not_leap() {
        assertFalseFor(1700);
        assertFalseFor(1800);
        assertFalseFor(1900);
        assertFalseFor(2100);
    }

    private static void assertTrueFor(int value) {
        //Prepare
        LeapYear leapYear = new LeapYear();
        //act
        boolean isLeapYear =  leapYear.detect(value);
        //assert
        Assertions.assertTrue(isLeapYear);
    }

    private static void assertFalseFor(int value) {
        //Prepare
        LeapYear leapYear = new LeapYear();
        //act
        boolean isLeapYear =  leapYear.detect(value);
        //assert
        Assertions.assertFalse(isLeapYear);
    }


}
