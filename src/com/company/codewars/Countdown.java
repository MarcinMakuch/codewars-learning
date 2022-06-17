package com.company.codewars;

public class Countdown {
    public static void main(String[] args) {

        reverseCount(10);

    }
    public static void reverseCount ( int num) {
        if(num == 0){
            System.out.println(num);
        } else {
            System.out.println(num);
            reverseCount(num -1);
        }

    }
}
