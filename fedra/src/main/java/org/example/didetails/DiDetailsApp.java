package org.example.didetails;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiDetailsApp {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("didetails.xml")) {


            String name = c.getBean("name", String.class);
            System.out.println(name);

        }
    }
}
