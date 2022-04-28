package com.company.codewars.kyu7;

public class ReplaceVowel {
    public static void main(String[] args) {


    }

    public static String replace(final String s) {
        String result = s.replaceAll("[aeiouAEIOU]", "!");
        return result;
    }
}
