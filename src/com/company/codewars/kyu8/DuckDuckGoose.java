package com.company.codewars.kyu8;

public class DuckDuckGoose {
    public static void main(String[] args) {
        String [] players = {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"};
        int num = 50;
        int counter=0;
        while (num > 10) {
            counter++;
            num = num - 10;
        }
        System.out.println(num);
        System.out.println(counter);

        System.out.println(players[num-1]);
    }

    public static String duckDuckGoose(String[] players, int goose) {
        for (int i = 0; i < players.length; i++) {

        }
        return "";
    }

}
