package com.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author 51465
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println("name = " + name + "; password = " + password);
    }
}
