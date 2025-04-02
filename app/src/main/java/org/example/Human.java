package org.example;

public class Human {
    private Weapon weapon;
    private String name;

    Human(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    void attack(Human other) {
        this.weapon.attack();
        System.out.println(other.getName() + "이/가 공격 당했다.");
    }

    public String getName() {
        return name;
    }
}
