package com.trainschedule.springboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ServiceApplication.class, args);
    }

}
