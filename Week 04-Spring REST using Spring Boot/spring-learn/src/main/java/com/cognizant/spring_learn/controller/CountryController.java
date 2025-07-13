package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
public class CountryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
	private CountryService countryService;

	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) {
		LOGGER.debug("START - getCountry for code: {}", code);
		Country country = countryService.getCountry(code);
		LOGGER.debug("END - getCountry: {}", country);
		return country;
	}

	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.debug("START - getCountryIndia");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country in = context.getBean("countryIN", Country.class);

		LOGGER.debug("END - getCountryIndia");
		return in;
	}
}
