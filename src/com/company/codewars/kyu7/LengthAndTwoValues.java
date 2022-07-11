package com.company.codewars.kyu7;

import java.util.Arrays;

public class LengthAndTwoValues {
    public static void main(String[] args) {

    }

    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] returningArray = new String[n];
        if (n == 0) {
            return returningArray;
        }
        for (int i = 0; i < returningArray.length; i++) {
            if (i % 2 == 0) {
                returningArray[i] = firstValue;
            } else returningArray[i] = secondValue;
        }
        return returningArray;
    }
}
