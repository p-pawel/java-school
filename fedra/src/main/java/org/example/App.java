package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        System.out.println(applicationContext);

        Object object = applicationContext.getBean("cartService");
        System.out.println(object);

        CartService cartService = applicationContext.getBean("cartService", CartService.class);
        System.out.println(cartService);

        Map<String, CartService> beans = applicationContext.getBeansOfType(CartService.class);
        System.out.println(beans);

    }
}
