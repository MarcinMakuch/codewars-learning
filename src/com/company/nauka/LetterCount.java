package com.company.nauka;


public class LetterCount {
    public static void main(String[] args) {

        String word = letterCounting("aaabbbggtttti");
        System.out.println(word);


    }

    public static String letterCounting(String word) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < word.length(); i++) {
            if (i == word.length() - 1) {
                sb.append(counter).append(word.charAt(i));
            } else if (word.charAt(i) == word.charAt(i + 1)) {
                counter++;
            } else if (word.charAt(i) != word.charAt(i + 1)) {
                sb.append(counter).append(word.charAt(i));
                counter = 1;
            }
        }
        return sb.toString();
    }
}