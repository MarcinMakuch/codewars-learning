package com.company.codewars.kyu7;

public class SurviveTheZombies {
    public static void main(String[] args) {

    }

    public static String zombieShootout(int zombies, int range, int ammo) {
        String ending = "";
        int shootFired = 0;
        int zombiesShoot = 0;
        if (range * 2 > zombies && ammo > zombies) {
            ending = "You shot all " + zombies + " zombies.";
        }
        for (int i = 1; i <= range * 2; i++) {
            zombiesShoot++;
            if (zombiesShoot == ammo) {
                ending = "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
            }
        }
        return ending;
    }
}

//ending="You shot all "+zombies+" zombies.";
//ending="You shot "+ammo+" zombies before being eaten: ran out of ammo.";
//ending="You shot "+zombies+" zombies before being eaten: overwhelmed.";