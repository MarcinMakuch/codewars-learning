package com.company.nauka;

public class Fish implements Prey, Predator {
    @Override
    public void hunt() {
        System.out.println("A");
    }

    @Override
    public void flee() {
        System.out.println("B");
    }
}
