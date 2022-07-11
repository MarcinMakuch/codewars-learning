package com.company.codewars.kyu7;

public class DotCalculator {
    public static void main(String[] args) {
        String plus = "... + .....";
        System.out.println(calc(plus));

    }

    public static String calc(String txt) {
        String dotAnswer = ".";
        String[] dotArr = txt.split(" ");
        if (dotArr[1].equals("+")) {
          int dotLen = dotArr[0].length() + dotArr[2].length();
            dotAnswer = dotAnswer.repeat(dotLen);
        }
        //Code here
        return dotAnswer;
    }
}
