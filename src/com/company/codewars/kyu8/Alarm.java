package com.company.codewars.kyu8;

public class Alarm {
    public static void main(String[] args) {

    }
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && ! vacation) {
            return true;
        }
        return false;
    }
}
