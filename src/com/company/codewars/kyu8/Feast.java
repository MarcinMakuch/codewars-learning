package com.company.codewars.kyu8;

public class Feast {
    public static void main(String[] args) {

        String beast = "great blue herob";
        String dish = "garlic nann";



    }

    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);

    }
}
