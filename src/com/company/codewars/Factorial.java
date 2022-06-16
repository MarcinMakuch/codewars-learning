package com.company.codewars;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialR(6));

    }
    public static int factorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
    public static int factorialR (int number) {
        if(number <= 1){
            return 1;
        }
        return number * factorialR(number -1);
    }
}
