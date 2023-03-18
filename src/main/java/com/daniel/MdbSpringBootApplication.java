package com.daniel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.daniel.domain.Movie;


@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication{
    
    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }
}
