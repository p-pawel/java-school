package com.fedranex.task3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private CarRepository carRepository;

    public CarsController(@Qualifier("samochody") CarRepository carRepository) {
        this.carRepository = carRepository;
        System.out.println("CarsController()");
    }

    @GetMapping
    public List<Car> getAll() {
        return carRepository.findAll();
    }

}
