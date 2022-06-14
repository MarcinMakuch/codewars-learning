package com.company.codewars.kyu8;

import java.util.Arrays;

public class YouOnlyNeedOne {
    public static void main(String[] args) {
        String x = "d";
        String[] words = {"a", "b", "c"};

        System.out.println(check(words, x));

    }

    public static boolean check(Object[] a, Object x) {
//        for (int i = 0; i < a.length; i++) {
//            if(a[i] == x) {
//                return true;
//            }
//        }
        if (Arrays.stream(a)
                .anyMatch(elem -> elem == x)) {
            return true;
        }
        return false;
    }
}
