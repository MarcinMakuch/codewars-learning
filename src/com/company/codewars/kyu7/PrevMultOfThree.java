package com.company.codewars.kyu7;

public class PrevMultOfThree {
    public static void main(String[] args) {

        int num = 0;

        System.out.println(prevMultOfThree(num));

    }

    public static Integer prevMultOfThree(int n) {
        while (n % 3 != 0 && n > 10) {
            if (n > 10) {
                n = n / 10;
            }
        }
        if (n % 3 == 0) {
            return n;
        } else
            return null;
    }
}
