package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class AppTask3 {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "random.xml");

        System.out.println("Wypisujemy: ");

        System.out.println(applicationContext.getBean("myRandom1", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom2", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom3", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());
        System.out.println(applicationContext.getBean("myRandom4", MyRandom.class).getValue());
//        System.out.println(applicationContext.getBean("myRandom", MyRandom.class).getValue());

//        MyRandom myRandom4 = new MyRandom();
//        System.out.println(myRandom4.getValue());
//        System.out.println(myRandom4.getValue());
//        System.out.println(myRandom4.getValue());
//        System.out.println(myRandom4.getValue());

        System.out.println(applicationContext.getBean("now"));
        Thread.sleep(1000);
        System.out.println(applicationContext.getBean("now"));
        Thread.sleep(1000);
        System.out.println(applicationContext.getBean("now"));
        Thread.sleep(1000);
        System.out.println(applicationContext.getBean("now"));
    }
}
