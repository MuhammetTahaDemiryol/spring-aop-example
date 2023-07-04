package com.tahademiryol.springaopexample.service;

import com.tahademiryol.springaopexample.aspects.ToCheckAspect;
import com.tahademiryol.springaopexample.model.Car;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CarService {
    private Logger logger = Logger.getLogger(CarService.class.getName());

    @ToCheckAspect
    public String showcaseCar(Car car) {
        logger.info("Showcasing car:" + car.getName());
        return "SUCCESS";
    }

    // This setter for mocking purposes
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
