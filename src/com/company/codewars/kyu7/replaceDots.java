package com.company.codewars.kyu7;

public class replaceDots {
    public static void main(String[] args) {
        String word = "s.df...lka.jsfl.kas.jf";
        System.out.println(replaceDots(word));

    }
    public static String replaceDots(String str) {
        return str.replace(".", "-");
    }
}
