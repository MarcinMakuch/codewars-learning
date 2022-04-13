package com.company.codewars.kyu8;

public class CatDogYears {
    public static void main(String[] args) {

    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] years = new int[3];
        years[0] = humanYears;
        int cat = 0;
        int dog = 0;
        if(humanYears == 1) {
            cat = 15;
            dog = 15;
        } else if(humanYears == 2) {
            cat = 24;
            dog = 24;
        } else {
            cat = 24 + (humanYears - 2) * 4;
            dog = 24 + (humanYears - 2) * 5;
        }
        years[1] = cat;
        years[2] = dog;
        return years;
    }
}
