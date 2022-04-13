package com.company.codewars.kyu8;

public class HQ9 {
    public static void main(String[] args) {

        String result = "";
        for (int i = 99; i > 2; i--) {
            result = result + i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n";
        }
        result = result + "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\nGo to the store and buy some more, 99 bottles of beer on the wall.";

        System.out.println(result);
    }

    public static String HQ9(char code) {
        String result = "";
        switch (code) {
            case 'H':
                result = "Hello World!";
                break;
            case 'Q':
                result = "Q";
                break;
            case '9':
                for (int i = 99; i > 2; i--) {
                    result = result + i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n";
                }
                result = result + "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\nGo to the store and buy some more, 99 bottles of beer on the wall.";
                break;
            default:
                result = "A";
        }
        return result;
    }
}


/*
99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall.*/

/*1 bottle of beer on the wall, 1 bottle of beer.

Take one down and pass it around, no more bottles of beer on the wall.
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall.*/
