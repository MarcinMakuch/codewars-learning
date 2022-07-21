package com.company.codewars.kyu8;

import java.util.stream.IntStream;

public class FindAverage {
    public static void main(String[] args) {

    }
    public static double find_average(int[] array){
        double sum = IntStream.of(array).sum();
        return sum/array.length;
    }
}
