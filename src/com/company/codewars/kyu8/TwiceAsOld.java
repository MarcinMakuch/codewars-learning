package com.company.codewars.kyu8;

public class TwiceAsOld {
    public static void main(String[] args) {
        int father = 58;
        int son = 30;
        System.out.println(TwiceAsOld(father, son));
    }

    public static int TwiceAsOld(int dadYears, int sonYears) {
        int result;
        result = (dadYears -(sonYears * 2));
        if(result < 0){
            result = result * (-1);
        }
        return result;
    }
}
