package com.company.nauka;

import java.util.Random;

public class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        Roll(random, number);
    }
    void Roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
