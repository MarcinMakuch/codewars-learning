package com.company.coderslab;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main04 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        myList.add("8");
        myList.add("9");

        for (String s : myList) {
            System.out.println(s);
        }

//        ListIterator<String> i = myList.listIterator(myList.size()); // Get the list iterator from the last index
//        while (i.hasPrevious()) {
//            System.out.println(i.previous());
//        }
    }
}
