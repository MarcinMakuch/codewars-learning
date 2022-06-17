package com.company.codewars.kyu7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pandemia {
    public static void main(String[] args) {

        String pandemia = "01000000X000X011X0X";
        int counterAll = 0;
        int counterInfected = 0;
        for (int i = 0; i < pandemia.length(); i++) {
            if (pandemia.charAt(i) != 'X') {
                counterAll++;
            }
        }
        String[] splitPandemia = pandemia.split("X");
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = 0; i < splitPandemia.length; i++) {
            if (splitPandemia[i].contains("1")) {
                temp = splitPandemia[i].replace("0", "1");
                sb.append(temp).append("X");
            } else sb.append(splitPandemia[i]).append("X");
        }
        temp = sb.toString();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                counterInfected++;
            }
        }
        double percentage = 100 * (double) counterInfected / counterAll;


    }

    public static double infected(String input) {
        int counterAll = 0;
        int counterInfected = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'X') {
                counterAll++;
            }
        }
        String[] splitPandemia = input.split("X");
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = 0; i < splitPandemia.length; i++) {
            if (splitPandemia[i].contains("1")) {
                temp = splitPandemia[i].replace("0", "1");
                sb.append(temp).append("X");
            } else sb.append(splitPandemia[i]).append("X");
        }
        temp = sb.toString();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                counterInfected++;
            }
        }
        if (counterInfected == 0) {
            return 0.0;
        } else
            return 100 * (double) counterInfected / counterAll;
    }
}
