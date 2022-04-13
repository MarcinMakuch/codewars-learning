package com.company.codewars.kyu8;

public class Reverse {
    public static void main(String[] args) {

    }
    public static int[] reverse(int n) {
       int [] arr = new int[n];
       int counter = 0;
        for (int i = n; i > 0; i--) {
            arr[counter] = i;
            counter++;
        }
        return arr;
    }
}
