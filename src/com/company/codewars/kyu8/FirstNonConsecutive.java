package com.company.codewars.kyu8;

public class FirstNonConsecutive {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 9, 10, 11};
        int result = 0;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i+1]!=arr[i]+1)
              result = arr[i+1];
        }
        System.out.println(result);

    }

    static Integer find(final int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                result = array[i];
                break;
            }
        }
        return result;
    }
}
