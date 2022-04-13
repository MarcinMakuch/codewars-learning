package com.company.codewars.kyu7;

import java.util.HashMap;
import java.util.Map;

public class fourSeven {
    public static void main(String[] args) {
        System.out.println(fourSeven(9));

    }

    public static int fourSeven(int n) {
        Map map = new HashMap();
        map.put(4, 7);
        map.put(7, 4);
        n = (int) map.getOrDefault(n, 0);
        return n;
    }
}
