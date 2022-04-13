package com.company.tablice;

import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int searchInt = 42;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int index = Arrays.binarySearch(arr, searchInt);
        System.out.println(index);
    }
}
