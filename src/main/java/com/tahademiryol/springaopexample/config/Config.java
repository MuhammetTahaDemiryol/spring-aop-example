package com.tahademiryol.springaopexample.config;

import com.tahademiryol.springaopexample.aspects.LoggingAspect;
import com.tahademiryol.springaopexample.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.tahademiryol.springaopexample")
@EnableAspectJAutoProxy // This annotation enables Spring to process @AspectJ annotations
public class Config {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }

}
