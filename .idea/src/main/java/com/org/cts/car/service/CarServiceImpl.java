package com.org.cts.car.service;

import com.org.cts.car.model.Car;
import com.org.cts.car.repositary.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CarServiceImpl implements  CarService{
@Autowired
    CarRepo carRepo;

    @Override
    public void createCar(Car car) {
      carRepo.save(car);
    }

    @Override
    public void updateCar(Car car) {
        carRepo.save(car);
    }

    @Override
    public String deleteById(Integer id) {
        carRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<Car> getAll() {
        List<Car>t=carRepo.findAll();
        return t;
    }

    @Override
    public Optional<Car> getById(Integer id) {
        Optional<Car>y=carRepo.findById(id);
        return y;
    }
}
