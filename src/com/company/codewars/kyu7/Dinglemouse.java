package com.company.codewars.kyu7;

public class Dinglemouse {

    public final static Dinglemouse INST = new Dinglemouse();

    private static int ONE_HUNDRED = 100;

    private int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }
    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(Dinglemouse.INST.plus100(28));
    }
}
