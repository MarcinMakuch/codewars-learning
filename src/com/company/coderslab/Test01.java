package com.company.coderslab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        List<String> newList = fruits.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        newList.stream()
                .forEach(System.out::println);
    }
}
