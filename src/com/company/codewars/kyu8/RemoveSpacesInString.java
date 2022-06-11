package com.company.codewars.kyu8;

public class RemoveSpacesInString {
    public static void main(String[] args) {

        String word = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(word));
    }
    public static String noSpace(final String x) {
        return x.replaceAll("[ ]","");
    }
}
