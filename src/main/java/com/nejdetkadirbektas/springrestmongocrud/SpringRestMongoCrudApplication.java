package com.nejdetkadirbektas.springrestmongocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringRestMongoCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestMongoCrudApplication.class, args);
    }

}
