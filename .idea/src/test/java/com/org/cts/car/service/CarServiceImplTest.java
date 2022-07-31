package com.org.cts.car.service;

import com.org.cts.car.model.Car;
import com.org.cts.car.repositary.CarRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarServiceImplTest {
    @InjectMocks
    private CarServiceImpl carServiceImp;
    @Mock
    private CarRepo  carRepo;

    @Test
    void createCar() {
        Car car=new Car();
        car.setId(100);
        car.setExpenditure(1000000);
        carServiceImp.createCar(car);
        Mockito.verify(carRepo,Mockito.times(1)).save(car);
    }

    @Test
    void updateCar() {
        Car car=new Car();
        car.setId(100);
        car.setExpenditure(1000000);
        carServiceImp.updateCar(car);
        Mockito.verify(carRepo,Mockito.times(1)).save(car);
    }

    @Test
    void deleteById() {
        int id=108;

        String s="success";
        String t=carServiceImp.deleteById(id);
        Mockito.verify(carRepo,Mockito.times(1)).deleteById(id);
        Assertions.assertEquals(s,t);

    }

    @Test
    void getAll() {
        Car  car= new Car();
        car.setId(107);
        car.setExpenditure(1000000);
        Car car1=new Car();
        car.setId(109);
        car.setExpenditure(100000000);
        List<Car>s=new ArrayList<>();

        s.add(car);
        s.add(car1);
        Mockito.when(carRepo.findAll()).thenReturn(s);
        List<Car>t=carServiceImp.getAll();
        Assertions.assertEquals(s.size(),t.size());
    }

    @Test
    void getById() {
        int id =111;
        Car car= new Car();
        car.setId(111);
        car.setName("maruthi");
        Optional<Car>s=Optional.of(car);
        Mockito.when(carRepo.findById(id)).thenReturn(s);
        Optional<Car>ss=carServiceImp.getById(id);
        Assertions.assertEquals(s,ss);
    }
}