package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        System.out.println("Starting SpringLearnApplication...");
        SpringApplication.run(SpringLearnApplication.class, args);
        displayAllCountries();
    }

    public static void displayAllCountries() {
        LOGGER.debug("START - displayAllCountries");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country us = context.getBean("countryUS", Country.class);
        Country de = context.getBean("countryDE", Country.class);
        Country in = context.getBean("countryIN", Country.class);
        Country jp = context.getBean("countryJP", Country.class);

        LOGGER.debug("US : {}", us.toString());
        LOGGER.debug("DE : {}", de.toString());
        LOGGER.debug("IN : {}", in.toString());
        LOGGER.debug("JP : {}", jp.toString());

        LOGGER.debug("END - displayAllCountries");
    }
}
