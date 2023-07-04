package com.tahademiryol.springaopexample.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect // This annotation makes this class an aspect
@Order(1) // This annotation defines the order of the aspect in the chain
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToCheckAspect)") // This annotation defines the pointcut or where the aspect will be applied
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("Logging Aspect: Method executed and returned " + returnedValue);
        return returnedValue;
    }

    // This setter for mocking purposes
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
