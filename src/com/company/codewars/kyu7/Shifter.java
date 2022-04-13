package com.company.codewars.kyu7;

import java.util.HashSet;
import java.util.Set;

public class Shifter {
    public static void main(String[] args) {
        String sentence = "WHO IS SHIFTER AND WHO IS NO";
        System.out.println(count(sentence));


    }
    public static int count(String sentence) {
        Set<String> temp = new HashSet<>();
        String [] word = sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            if(word[i].matches("^[HINOSXZMW]+$")){
                temp.add(word[i]);
            }
        }
        int counter = temp.size();
        return counter;
    }
}
