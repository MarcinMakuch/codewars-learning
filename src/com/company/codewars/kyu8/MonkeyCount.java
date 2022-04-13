package com.company.codewars.kyu8;

public class MonkeyCount {
    public static void main(String[] args) {

        System.out.println(monkeyCount(10));

    }
    public static int[] monkeyCount(final int n){
        int [] monkeyTable = new int[n];
        for (int i = 0; i < monkeyTable.length; i++) {
            monkeyTable[i] = i+1;
        }
        return monkeyTable;
    }
}
