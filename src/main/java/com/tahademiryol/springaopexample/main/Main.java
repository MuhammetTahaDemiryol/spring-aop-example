package com.tahademiryol.springaopexample.main;

import com.tahademiryol.springaopexample.config.Config;
import com.tahademiryol.springaopexample.model.Car;
import com.tahademiryol.springaopexample.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var service = context.getBean(CarService.class);

        Car car = new Car();
        car.setName("BMW");
        car.setModel("M3");

        service.showcaseCar(car);
    }
}
