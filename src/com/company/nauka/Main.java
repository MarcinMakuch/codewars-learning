package com.company.nauka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("podaj x ");
            int x = sc.nextInt();
            System.out.println("podaj y ");
            int y = sc.nextInt();

            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("zle" + exception);
        }

    }
}