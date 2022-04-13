package com.company.codewars.kyu8;

public class PythagoreanTriple {
    public static void main(String[] args) {

    }

    public int pythagoreanTriple(int[] triple) {
        int min = triple[0];
        int middle = triple[1];
        int max = triple[2];
        if(max * max == min * min + middle * middle){
            return 1;
        }
        return 0;
    }
}
