package com.company.codewars.kyu7;

public class Plant {
    public static void main(String[] args) {

        System.out.println(plant('@', 4, 2, 40));

    }

    public static String plant(char seed, int water, int fert, int temp) {
        String kwiat = "";
        String lodyga = "";
        String fullKwiat = "";
        String kwiatek = "";
        boolean check = false;
        for (int i = 0; i < fert; i++) {
            kwiat = kwiat + seed;
        }
        for (int i = 0; i < water; i++) {
            lodyga = lodyga + "-";
        }
        fullKwiat = lodyga + kwiat;
        for (int i = 0; i < water; i++) {
            if(temp > 30 || temp < 20) {
                check = true;
                kwiatek = kwiatek + lodyga;
            }
            else {
                kwiatek = kwiatek + fullKwiat;
            }
        }
        if (check) {
            kwiatek = kwiatek + seed;
        }
        return kwiatek;
    }
}
