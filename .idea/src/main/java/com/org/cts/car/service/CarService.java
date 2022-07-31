package com.org.cts.car.service;


import com.org.cts.car.model.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface CarService {

    public  void createCar( Car car);
    public  void updateCar(Car car);
    public String deleteById( Integer id);
    public List<Car> getAll();
    public Optional<Car> getById( Integer id);
}
