package com.company.codewars.kyu8;

import java.util.Arrays;

public class MultipleOfIndex {
    public static void main(String[] args) {



    }

    public static int[] multipleOfIndex(int[] array) {
        int[] arr = new int[array.length];
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                arr[counter] = array[i];
                counter++;
            }
        }
        int[] arr2 = new int[counter];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr2[i] = arr[i];
            }
        }
        return arr2;   //your code;
    }
}
