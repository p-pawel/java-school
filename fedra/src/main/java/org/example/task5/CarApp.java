package org.example.task5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("task5.xml")) {


        };
    }
}
