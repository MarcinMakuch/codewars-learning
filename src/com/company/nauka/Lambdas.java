package com.company.nauka;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(0);
        numbers.removeIf(x -> x == 0);
        System.out.println(numbers);



    }
}
