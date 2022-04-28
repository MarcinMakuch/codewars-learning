package com.company.codewars.kyu7;

import java.util.Arrays;

public class SquareOrSquareRoot {
    public static void main(String[] args) {

        int[] arr = {4,3,9,7,2,1};
        System.out.println(Arrays.toString(squareOrSquareRoot(arr)));

    }

    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) == Math.floor(Math.sqrt(array[i]))) {
                array[i] = (int) Math.sqrt(array[i]);
            }else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }
}
