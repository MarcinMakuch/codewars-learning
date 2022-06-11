package com.company.nauka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCode {
    public static void main(String[] args) throws IOException {

//        IntStream
//                .range(1,11)
//                .forEach(System.out::print);
//        System.out.println();
//        IntStream
//                .range(1,11)
//                .skip(2)
//                .forEach(x -> System.out.print(x));
//        System.out.println();
//        System.out.print(IntStream
//        .range(1,10)
//        .sum());
//        System.out.println();
//        Stream.of("marcin", "alicja", "ela", "wojciech")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::print);
//        System.out.println();
//        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("S"))
//                .sorted()
//                .forEach(System.out::print);
//
//        System.out.println("tablica");

//        int [] tablica = {1,2,3,4,5,6,7};
//        Arrays.stream(tablica)
//                .map(x -> x * x)
//                .average()
//                .ifPresent(System.out::println);
//       System.out.println();
//        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
//        people.stream()
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("a"))
//                .forEach(System.out::println);
//        System.out.println();
//
//        Stream <String> bands = Files.lines(Paths.get("C:\\Java moje projekty\\nauka\\src\\com\\company\\nauka\\bands.txt"));
//            bands.sorted()
//                    .filter(x -> x.length() > 13)
//                    .forEach(System.out::println);
//            bands.close();
//        System.out.println();
//
//        List <String> bands2 = Files.lines(Paths.get("C:\\Java moje projekty\\nauka\\src\\com\\company\\nauka\\bands.txt"))
//                .filter(x -> x.contains("jit"))
//                .collect(Collectors.toList());
//        bands2.forEach(x -> System.out.println(x));

//        List<String> strings = Arrays.asList("helloworld", "", "huluprey", "brawl", "goonies","", "benio");
//        List<String> filtered = strings.stream()
//                .filter(string -> !string.isEmpty())
//                .filter(string -> string.length() == 8)
//                .map(string -> string.replace("a", "x"))
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(filtered);
        int [] tablica2 = {2, 3, 4, 5, 6};
        int sum = Arrays.stream(tablica2)
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println(sum);

    }
}
