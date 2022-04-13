package com.company.codewars.kyu8;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BlueAndRedMarbles {
    public static void main(String[] args) {

        System.out.println(guessBlue(5, 5, 2, 3));

    }

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        int blueLeft = blueStart - bluePulled;
        int redLeft = redStart - redPulled;
        double wynik = (double) blueLeft / (double) (blueLeft + redLeft);
        BigDecimal bd = new BigDecimal(wynik).setScale(1, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        return newInput;

    }
}
