package com.company.tablice;


public class DynamicArray {
    public static void main(String[] args) {

        //linear search

        int[] arr = {2, 3, 6, 5, 7, 9, 0, 8, 7, 6, 5, 4};
        int index = linearSearch(arr, 9);
        System.out.println(index);
    }

    private static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
