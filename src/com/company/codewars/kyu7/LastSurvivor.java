package com.company.codewars.kyu7;

public class LastSurvivor {
    public static void main(String[] args) {

        String word = "abne";
        int[] count = {3, 1, 0};
        System.out.println(lastSurvivor(word, count));

    }
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);
        for (int i = 0; i < coords.length; i++) {
            sb.deleteCharAt(coords[i]);
        }
        String temp = sb.toString();
        return temp;
    }
}
