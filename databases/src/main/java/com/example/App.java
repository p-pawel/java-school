package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class App {

    private OrderFactory orderFactory = new OrderFactory();
    private static OrderRepository orderRepository = new OrderRepository();

    public static void main(String[] args) throws SQLException {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=nowy_schemat";

            Properties properties = new Properties();
            properties.setProperty("user", "postgres");
            properties.setProperty("password", "postgres");

            try (Connection c = DriverManager.getConnection(url, properties)) {
                orderRepository.setConnection(c);
                new App().run();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    void run() throws SQLException {

        List<OrderTO> lastOrders = orderRepository.loadLastOrders(3);
        System.out.println("Ostatnie 3 zamówienia:");
        lastOrders.forEach(System.out::println);
        System.out.println();

        System.out.println("Ostatnie 24h zamówienia:");
        List<OrderTO> last24hOrders = orderRepository.loadLast24hOrders();
        last24hOrders.forEach(System.out::println);

        OrderTO orderTO = orderFactory.createOrder();

        int result = orderRepository.save(orderTO);

        System.out.println(result);
    }


}
