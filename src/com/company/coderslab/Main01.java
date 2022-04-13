package com.company.coderslab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        System.out.println(lista);

        removeDivider(lista, 2);
        System.out.println(lista);

    }
    public static void removeDivider (List<Integer> list, int divider) {
        Iterator<Integer> iter = list.listIterator();
        while(iter.hasNext()) {
            if(iter.next() % divider == 0) {
                iter.remove();
            }
        }
    }
}
