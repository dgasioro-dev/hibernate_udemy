package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("User id 10001 -> {}", repository.findById(10001));

//        LOGGER.info("All persons -> {}", repository.findAll());
//        LOGGER.info("Deleting person with id = 10002 and affected rows: {}", repository.deleteById(10002));
//        LOGGER.info("Inserting 10004 -> {}", repository.insert(new Person(10004, "Tara", "Berlin", new Date())));
//        LOGGER.info("Updating 10003 -> {}", repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
    }
}
