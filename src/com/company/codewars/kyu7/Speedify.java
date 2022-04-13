package com.company.codewars.kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speedify {
    public static void main(String[] args) {
        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('A', 0);
        alphabet.put('B', 1);
        alphabet.put('C', 2);
        alphabet.put('D', 3);
        alphabet.put('F', 4);
       for (Integer i : alphabet.values()){
           System.out.println(i);
       }

    }
    public static String speedify(final String input) {
        String [] speed = new String[24];
        String finalWord = "";
        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('A', 0);
        alphabet.put('B', 1);
        alphabet.put('C', 2);
        alphabet.put('D', 3);
        alphabet.put('F', 4);
        alphabet.put('G', 5);
        alphabet.put('H', 6);
        alphabet.put('I', 7);
        alphabet.put('J', 8);
        alphabet.put('K', 9);
        alphabet.put('L', 10);
        alphabet.put('M', 11);
        alphabet.put('N', 12);
        alphabet.put('O', 13);
        alphabet.put('P', 14);
        alphabet.put('Q', 15);
        alphabet.put('R', 16);
        alphabet.put('S', 17);
        alphabet.put('T', 18);
        alphabet.put('U', 19);
        alphabet.put('V', 20);
        alphabet.put('W', 21);
        alphabet.put('X', 22);
        alphabet.put('Y', 23);
        alphabet.put('Z', 24);
        for (int i = 0; i < input.length(); i++) {
                for (Character key : alphabet.keySet()) {
                    if(input.charAt(i) == key){

                    }
                }
            }

        return ""; // your code here
    }
}
