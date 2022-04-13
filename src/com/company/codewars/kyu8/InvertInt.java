package com.company.codewars.kyu8;

public class InvertInt {
    public static void main(String[] args) {

    }
    public static int[] invert(int[] array) {
        int [] arrTemp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrTemp[i] = array[i] * (-1);
        }
        return arrTemp;
    }
}
