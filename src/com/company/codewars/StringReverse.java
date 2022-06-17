package com.company.codewars;

public class StringReverse {
    public static void main(String[] args) {

        String word = "abcdefghijklam";
        System.out.println(reverseWord(word));

    }
    public static String reverseWord(String word) {
        if(word == null || word.isEmpty()){
            return word;
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse.append(word.charAt(i));
        }
        return reverse.toString();
    }
}
