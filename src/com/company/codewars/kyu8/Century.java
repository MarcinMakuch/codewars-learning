package com.company.codewars.kyu8;

public class Century {
    public static void main(String[] args) {
        int n = 1706;
        System.out.println(century(n));


    }

    public static int century(int number) {
        if (number % 100 != 0) {
            number = (number / 100) + 1;
        } else number = number / 100;
        return number;
    }
}
