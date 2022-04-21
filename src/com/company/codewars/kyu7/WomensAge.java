package com.company.codewars.kyu7;

public class WomensAge {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(womensAge(n));

    }
    public static String womensAge(int n) {
        int twentyOrTwentyOne = 0;
        int result = 0;
        if(n % 2 == 0){
            twentyOrTwentyOne = 20;
            result = n / 2;
        } else {
            twentyOrTwentyOne = 21;
            result = (n-1) /2;
        }
        return n+"? That's just " + twentyOrTwentyOne + ", in base " + result + "!";
    }
}
// "32? That's just 20, in base 16!"