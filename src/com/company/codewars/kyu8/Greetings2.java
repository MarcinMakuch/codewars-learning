package com.company.codewars.kyu8;

public class Greetings2 {
    public static void main(String[] args) {

    }
    static String greet(String name, String owner) {
        if(name.equals(owner)){
            return "Hello boss";
        } else
        return "Hello guest";
    }
}
