package com.company.codewars.kyu8;

public class Position {
    public static void main(String[] args) {

        char a = 'z';
        System.out.println(position(a));
    }
    public static String position(char alphabet) {
        String letterPosition = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        char [] elementArr = letterPosition.toCharArray();
        for (int i = 0; i < elementArr.length; i++) {
            if(elementArr[i] == alphabet) {
                result = String.valueOf(i+1);
            }
        }
        return result;
    }
}
