package com.company.codewars.kyu8;

public class NearestSq {
    public static void main(String[] args) {
        int n = 111;
        double result = Math.sqrt(n);

        System.out.println(result);


    }

    public static int nearestSq(final int n) {
        double result = Math.sqrt(n);
        result = Math.round(result);
        result = Math.pow(result, 2);
        return (int) result;
    }
}
