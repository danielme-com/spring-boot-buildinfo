package com.danielme.springboot.buildinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;

@SpringBootApplication
public class BuildInfoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(BuildInfoApplication.class);

    @Autowired
    private BuildProperties buildProperties;

    public static void main(String[] args) {
        SpringApplication.run(BuildInfoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("name: {}, custom: {}", buildProperties.getName(), buildProperties.get("custom"));
    }

}
