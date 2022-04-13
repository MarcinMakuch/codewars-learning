package com.company.codewars.kyu8;

public class ChangeLight {
    public static void main(String[] args) {

    }

    public static String updateLight(String current) {
        String currentLight = "";
        switch (current) {
            case "green":
                currentLight = "yellow";
                break;
            case "yellow":
                currentLight = "red";
                break;
            case "red":
                currentLight = "green";
                break;

        }
        return currentLight;
    }
}
