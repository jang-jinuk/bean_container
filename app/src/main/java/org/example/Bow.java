package org.example;

public class Bow implements Weapon{
    private static Bow instance = null;

    public static Bow getInstance() {
        if (instance == null) return new Bow();
        return instance;
    }

    private Bow() {
    }

    @Override
    public void attack() {
        System.out.println("활을 쐈다. ");
    }
}
