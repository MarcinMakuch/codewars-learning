package com.company.codewars.kyu8;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {


    }
    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list.length-1;
    }
}
