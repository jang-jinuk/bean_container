package org.example;

public class Sword implements Weapon{
    private static Sword instance = null;
    public static Sword getInstance(){
        if (instance == null) return new Sword();
        return instance;
    }
    private Sword(){}
    @Override
    public void attack() {
        System.out.println("칼로 찔렀다 ");
    }
}
