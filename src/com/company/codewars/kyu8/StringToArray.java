package com.company.codewars.kyu8;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String word = "I love arrays they are my favorite";

    }

    public static String[] stringToArray(String s) {
        String[] tempArr = new String[s.length()];
        tempArr = s.split(" ");
        return tempArr;
    }
}
