package com.bridgelabz.util;

import java.io.FileInputStream;
import java.util.Properties;

public class DataRead {
    public static String getProperty(String key) {
        String property = "";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("C:\\Users\\Rajkamal\\IdeaProjects\\LinkedIn_Selenium\\src\\test\\java\\com\\bridgelabz\\files\\LoginData.properties"));
            property = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return property;
    }
}
