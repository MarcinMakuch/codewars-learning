package com.company.codewars.kyu8;

public class ExpressionsMatter {
    public static void main(String[] args) {



    }

    public static int expressionsMatter(int a, int b, int c) {
        int sum = 0;
        int temp = 0;
        temp = a * b * c;
        if(temp > sum) {
            sum = temp;
        }
        temp = a + b + c;
        if(temp > sum) {
            sum = temp;
        }
        temp = (a + b) * c;
        if(temp > sum) {
            sum = temp;
        }
        temp = a * (b + c);
        if(temp > sum) {
            sum = temp;
        }
        temp = a + (b * c);
        if(temp > sum) {
            sum = temp;
        }
        temp = (a * b) + c;
        if(temp > sum) {
            sum = temp;
        }
        return sum;
    }
}
