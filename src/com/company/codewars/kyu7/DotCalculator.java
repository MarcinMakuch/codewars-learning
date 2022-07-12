package com.company.codewars.kyu7;

public class DotCalculator {
    public static void main(String[] args) {
        String plus = "... + .....";
        System.out.println(calc(plus));

        String plus2 = "... * .....";
        System.out.println(calc(plus2));

        String plus3 = "... - .....";
        System.out.println(calc(plus3));

        String plus4 = "...... - ...";
        System.out.println(calc(plus4));

    }

    public static String calc(String txt) {
        String dotAnswer = ".";
        int dotLen = 0;
        String[] dotArr = txt.split(" ");
        if (dotArr[1].equals("+")) {
            dotLen = dotArr[0].length() + dotArr[2].length();
        } else if (dotArr[1].equals("*")) {
            dotLen = dotArr[0].length() * dotArr[2].length();
        } else if (dotArr[1].equals("-")) {
            dotLen = dotArr[0].length() - dotArr[2].length();
            if (dotLen < 0) {
                return "";
            }
        } else if (dotArr[1].equals("//")) {
            if(dotArr[0].length() <= 0 || dotArr[0].length() < dotArr[2].length()){
                return "";
            }
            dotLen = dotArr[0].length() / dotArr[2].length();
        }
        return dotAnswer.repeat(dotLen);
    }
}
