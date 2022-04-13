package com.company.codewars.kyu8;

public class SimpleMultiplication {
    public static void main(String[] args) {

    }

    public static int simpleMultiplication(int n) {
        int result = -1;
        if (n % 2 == 0) {
            result = n * 8;
        } else result = n * 9;
        return result;
    }
}
