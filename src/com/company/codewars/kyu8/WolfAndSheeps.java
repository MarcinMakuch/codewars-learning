package com.company.codewars.kyu8;

public class WolfAndSheeps {
    public static void main(String[] args) {

        String[] arr = {"sheep", "sheep", "wolf", "sheep", "sheep"};
        System.out.println(warnTheSheep(arr));

    }

    public static String warnTheSheep(String[] array) {
        String wolf = "wolf";
        String empty = "";
        int position = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(wolf)) {
                position = (array.length - i) - 1;
            }
        }
        if (array[array.length - 1].equals(wolf)) {
            empty = "Pls go away and stop eating my sheep";
        } else {
            empty = "Oi! Sheep number " + position + "! You are about to be eaten by a wolf!";
        }
        return empty;
    }
}
//