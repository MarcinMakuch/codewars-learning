package com.company.codewars.kyu7;

public class FindSquares {
    public static void main(String[] args) {
        int num = 99991;
        long n = 9;
        System.out.println(n/2);


    }
    public static String findSquares(int n){
        String result = "";
        long max = (n / 2) + 1;
        long min = n / 2;
        min = (long) Math.pow(min, 2);
        max = (long) Math.pow(max, 2);
        result = +max+"-"+min;
        return result;
    }
}
