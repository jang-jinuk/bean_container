package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
class ConfigLoader {
    private ConfigLoader(){}

    private static Properties properties = new Properties();
    static {
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties")) {
            if (inputStream == null) {
                throw new RuntimeException("설정 파일을 찾을 수 없습니다.");
            }
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("설정 파일을 읽을 수 없습니다.", e);
        }
    }
    public static Weapon getProperty(String key) {
        if (key.equals("weapon.sword")) {
            return Sword.getInstance();
        } else {
            return Bow.getInstance();
        }
    }

    public static Human getHuman(Weapon weapon, String name) {
        return new Human(weapon, name);
    }
}
