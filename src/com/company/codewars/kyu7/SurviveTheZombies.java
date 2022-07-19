package com.company.codewars.kyu7;

public class SurviveTheZombies {
    public static void main(String[] args) {

    }

    public static String zombieShootout(int zombies, int range, int ammo) {
        String ending = "";
        if (range * 2 > zombies && ammo > zombies) {
            ending = "You shot all " + zombies + " zombies.";
        }
        if (range * 2 > zombies && ammo < zombies) {
            ending = "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
        }
        if (range * 2 < zombies && ammo > zombies) {
            ending = "You shot " + zombies + " zombies before being eaten: overwhelmed.";
        }
        return ending;
    }
}
