package com.company.nauka;

import java.util.ArrayList;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        myList.stream()
                .filter(n -> n % 3 == 0)
                .map(n -> n * n)
                .filter(n -> n < 50 && n > 30)
                .forEach(System.out::println);
    }
}
