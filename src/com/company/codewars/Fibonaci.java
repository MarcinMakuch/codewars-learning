package com.company.codewars;

public class Fibonaci {
    public static void main(String[] args) {



    }
    public static int fibonacci(int n){
        if(n<2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
