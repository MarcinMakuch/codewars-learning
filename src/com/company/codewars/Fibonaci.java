package com.company.codewars;

public class Fibonaci {
    public static void main(String[] args) {

        //System.out.println(fibonacci(6));
        //System.out.println(fibonacciLoop(5));
        fibonacciLoop(16);
    }

    public static int fibonacci(int n) {
        if (n < 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciLoop(int n) {
        int fibo = 1, fL = 1, fR = 1;
        for (int i = 1; i <= n; i++) {
            fibo = fL + fR; // fL = 1 / fR = 1/ fibo = 2
            fL = fR;
            fR = fibo;
            System.out.print(fibo+", ");
        }
        return fibo;
    }
}
