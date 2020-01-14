package com.fedranex.task3;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component("samochody")
public class CarRepository {

    List<Car> cars = new ArrayList<>();

    public CarRepository() {
        cars.add(new Car(3, 1990, "Trabant"));
        cars.add(new Car(5, 1990, "Trabant"));
    }

    public List<Car> findAll() {
        return cars;
    }

    public Optional<Car> findOne(long id) {
        return cars.stream()
                .filter(a->a.getId()==id)
                .findFirst();
    }

    public Car save(Car car) {
        cars.add(car);
        return car;
    }

}
