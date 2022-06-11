package com.company.codewars;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(9));
        System.out.println(fizzBuzz(25));
        System.out.println(fizzBuzz(61));

    }

    public static String fizzBuzz(int num) {
        String answer = "";
        if (num % 15 == 0) {
            answer = "FizzBuzz";
        } else if (num % 3 == 0) {
            answer = "Fizz";
        } else if (num % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = Integer.toString(num);
        }
        return answer;
    }
}
