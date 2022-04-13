package com.company.tablice;

import java.util.Collections;
import java.util.LinkedList;

public class Main02 {
    public static void main(String[] args) {


        LinkedList<String> mojaLista = new LinkedList<String>();
        mojaLista.push("A"); // linkedlist jako stack czyli push i pop
        mojaLista.push("C");
        mojaLista.push("G");
        mojaLista.push("Z");
        mojaLista.pop();

        LinkedList<String> mojaLista2 = new LinkedList<String>();
        mojaLista2.offer("A"); // linkedList jako queue czyli offer i poll
        mojaLista2.offer("C");
        mojaLista2.offer("G");
        mojaLista2.offer("Z");

        //   mojaLista2.poll();

        mojaLista2.add(0, "X");

        //System.out.println(mojaLista);
        System.out.println(mojaLista2);
    }
}
