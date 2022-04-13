package com.company.tablice;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        //Queue<String> kolejka = new LinkedList<>();
        Queue<String> kolejka = new PriorityQueue<>();
        kolejka.offer("Marcin");
        kolejka.offer("Ela");
        kolejka.offer("Alicja");
        kolejka.offer("Wojtek");
        kolejka.offer("Benio");
        kolejka.add("Ziutek");
/*        System.out.println(kolejka);
        System.out.println(kolejka.peek());
        kolejka.remove();
        System.out.println(kolejka);
        System.out.println(kolejka.peek());

        kolejka.removeIf(el -> el.equals("Benio"));
        System.out.println(kolejka);*/
        System.out.println(kolejka);

    }
}
