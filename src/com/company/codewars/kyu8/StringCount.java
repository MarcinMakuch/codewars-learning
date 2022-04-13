package com.company.codewars.kyu8;

public class StringCount {
    public static void main(String[] args) {

    }

    public static int strCount(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;   //write code here
    }
}
