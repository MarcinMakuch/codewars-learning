package com.company.codewars.kyu8;

public class Correct {
    public static void main(String[] args) {

        String name = "szdfa5ssa5dg5sdg";
        String word = correct(name);
        System.out.println(word);

    }
    public static String correct(String string) {
        String s1 = string.replace("5", "S").replace("0", "O").replace("1", "I");
        return s1;
    }
}
