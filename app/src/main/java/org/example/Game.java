package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Game {
    public static void main(String[] args) {
//        Weapon sword = ConfigLoader.getProperty("weapon.sword");
//        Weapon bow = ConfigLoader.getProperty("weapon.bow");
//
//        Human human1 = ConfigLoader.getHuman(sword, "human1");
//        Human human2 = ConfigLoader.getHuman(bow, "human2");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Human human1 = context.getBean("human1", Human.class);
        Human human2 = context.getBean("human2", Human.class);
        human1.attack(human2);
        human2.attack(human1);
    }
}
