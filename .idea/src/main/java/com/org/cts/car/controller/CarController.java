package com.org.cts.car.controller;

import com.org.cts.car.model.Car;
import com.org.cts.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {
    @Autowired
    CarService  carService;
    @PostMapping("/create")
    public  void createCar(@RequestBody Car car){
        carService.createCar(car);
    }
    @PutMapping("/update")
    public  void updateCar(@RequestBody  Car car){
        carService.updateCar(car);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
     String ss=   carService.deleteById(id);
        return ss;
    }
    @GetMapping("/getAll")
    public List<Car>getAll(){
        List<Car>s=carService.getAll();
        return s;
    }
    @GetMapping("/getById/{id}")
    public Optional<Car>getById(@PathVariable Integer id){
        Optional<Car>h=carService.getById(id);
        return h;
    }
}
