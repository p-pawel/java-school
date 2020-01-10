package com.example;

import ratpack.exec.Blocking;
import ratpack.guice.Guice;
import ratpack.hikari.HikariModule;
import ratpack.jackson.Jackson;
import ratpack.server.RatpackServer;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        RatpackServer.start(server -> server
                        .registry(Guice.registry(bindings ->
                                bindings.module(HikariModule.class, config -> {
                                    config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
                                    config.setUsername("postgres");
                                    config.setPassword("postgres");
                                    config.addDataSourceProperty("URL", "jdbc:postgresql://localhost:5432/postgres?currentSchema=nowy_schemat");
                                })
                        ))
                        .handlers(
                                chain -> chain
                                        .get(ctx -> ctx.render("Hello World!"))
                                        .get("hello", ctx -> ctx.render("Hello Ratpack"))
                                        .get("hello2", ctx -> {
                                            ctx.getResponse().beforeSend(response -> response.getHeaders().add("Programator", "Katowice"));

                                            Car car = new Car();
                                            ctx.render(Jackson.json(new ErrorMessage("1234", "Coś poszło nie tak.")));
                                        })
                                        .get("cars", ctx -> {
                                            List<Car> cars = new ArrayList<>();
                                            cars.add(new Car());
                                            cars.add(new Car());
                                            cars.add(new Car());

                                            ctx.render(Jackson.json(cars));
                                        })
                                        .get("cars/:id", ctx -> {
                                            String id = ctx.getPathBinding().getAllTokens().get("id");

                                            try {


                                                int idAsInt = Integer.parseInt(id);
                                                if (idAsInt <= 100) {

                                                    Car car = new Car();
                                                    car.setId(idAsInt);

                                                    ctx.render(Jackson.json(car));
                                                } else {
                                                    ctx.getResponse().beforeSend(response -> response.status(404));
													ctx.render(Jackson.json(new ErrorMessage("NOTFOUND", "Nie znamy tego auta.")));
                                                }
                                            } catch (NumberFormatException e) {

                                                ctx.getResponse().beforeSend(response -> response.status(400));
                                                ctx.render(Jackson.json(new ErrorMessage("1234", "To nie jest prawidłowy numer.")));

                                            }
                                        })
                                        .get("orders", ctx -> Blocking
                                                .get(() -> {
                                                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
                                                        OrderRepository orderRepository = new OrderRepository();
                                                        orderRepository.setConnection(connection);
                                                        return orderRepository.loadLastOrders(10);
                                                    }
                                                })
                                                .then(orderTOList -> ctx.render(Jackson.json(orderTOList)))
                                        )
                                        .path("orders/:id", ctx -> ctx.byMethod(
                                                method -> method
                                                        .get(() -> Blocking
                                                                .get(() -> {
                                                                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {

                                                                        String id = ctx.getPathBinding().getAllTokens().get("id");
                                                                        int idAsInt = Integer.parseInt(id);

                                                                        OrderRepository orderRepository = new OrderRepository();
                                                                        orderRepository.setConnection(connection);
                                                                        return orderRepository.loadById(idAsInt);
                                                                    }
                                                                })
                                                                .then(orderTOList -> ctx.render(Jackson.json(orderTOList)))
                                                        )
                                                        .delete(() -> Blocking
                                                                .get(() -> {
                                                                    try (Connection connection = ctx.get(DataSource.class).getConnection()) {

                                                                        String id = ctx.getPathBinding().getAllTokens().get("id");
                                                                        int idAsInt = Integer.parseInt(id);

                                                                        OrderRepository orderRepository = new OrderRepository();
                                                                        orderRepository.setConnection(connection);
                                                                        return orderRepository.deleteById(idAsInt);
                                                                    }
                                                                })
                                                                .then(deleteResult -> {
                                                                    if (!deleteResult) {
                                                                        ctx.getResponse().beforeSend(response -> response.status(404));
                                                                    }
                                                                })
                                                        )
                                        ))


                        )
        );
    }
}

