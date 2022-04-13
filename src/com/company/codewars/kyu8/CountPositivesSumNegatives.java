package com.company.codewars.kyu8;

import java.lang.reflect.Array;

public class CountPositivesSumNegatives {
    public static void main(String[] args) {

        int[] arr = new int[]{};
        int[] temp = countPositivesSumNegatives(arr);

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int positiveCount = 0;
        int negativeResult = 0;
        if (input.length == 0 || input == null) {
            int[] emptyArr = {};
            return emptyArr;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positiveCount++;
            } else
            if (input[i] < 0) {
                negativeResult = negativeResult + input[i];
            }
        }

        int[] result = new int[2];
        result[0] = positiveCount;
        result[1] = negativeResult;
        return result;
    }
}
