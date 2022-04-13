package com.company.codewars.kyu8;

public class SultiTable {
    public static void main(String[] args) {

        int num = 5;
        System.out.println(multiTable(num));

    }
    public static String multiTable(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }
        return result.toString().trim(); // good luck
    }
}
