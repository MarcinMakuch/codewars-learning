package com.company.codewars.kyu8;

public class DoubleMap {
    public static void main(String[] args) {

    }
    public static int[] map(int[] arr) {
        int [] doubleArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i] * 2;
        }
        return doubleArr;
    }
}
