package com.company.codewars.kyu8;

public class CuboidVolumes {
    public static void main(String[] args) {

    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < firstCuboid.length; i++) {
            a = a * firstCuboid[i];
        }
        for (int i = 0; i < secondCuboid.length; i++) {
            b = b * secondCuboid[i];
        }
        int result;
        return result = a - b > b - a ? a - b : b - a;
    }
}
