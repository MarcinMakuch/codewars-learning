package com.company.codewars.kyu8;

public class Grow {
    public static void main(String[] args) {

    }
    public static int grow(int[] x){
        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= x[i];
        }
        return result;

    }
}
