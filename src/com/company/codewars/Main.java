package com.company.codewars;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();
        //old approach

/*        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        females.forEach(System.out::println);*/

        // new approach
        // filter
/*        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .forEach(System.out::println);

        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/
        // sort

/*        people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);*/
// match
/*        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 20);
        System.out.println(allMatch);

        boolean antonio = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        System.out.println(antonio);*/


        // max
/*        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);*/
        //System.out.println(max);


/*        Optional<String> femaleOptional = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        femaleOptional.ifPresent(System.out::println);*/
        AtomicInteger counter = new AtomicInteger(0);
        people.stream()
                .filter(person -> person.getName().length() > 8)
                .forEach(item -> {
                    counter.getAndIncrement();
                });


        System.out.println(counter);
        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
