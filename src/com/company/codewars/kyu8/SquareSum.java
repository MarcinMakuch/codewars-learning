package com.company.codewars.kyu8;

public class SquareSum {
    public static void main(String[] args) {

    }
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += (int) Math.pow(n[i], 2);
        }
        return sum;
    }
}
