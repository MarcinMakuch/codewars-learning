package com.company.codewars.kyu7;

import java.util.Arrays;

public class HappyBirthday {
    public static void main(String[] args) {

        System.out.println(wrap(1,3,1));
    }

    public static int wrap(int height, int width, int length) {
        int[] arr = {height, width, length};
        Arrays.sort(arr);
        return 4 * arr[0] + 2 * (arr[1] + arr[2]) + 20;
    }
}
