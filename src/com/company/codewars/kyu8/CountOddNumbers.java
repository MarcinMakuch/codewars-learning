package com.company.codewars.kyu8;

public class CountOddNumbers {
    public static void main(String[] args) {
        System.out.println(oddCount(15023));

    }

    public static int oddCount(int n) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
