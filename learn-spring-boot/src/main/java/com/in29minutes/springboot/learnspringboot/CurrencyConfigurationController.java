package com.in29minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//we want to see our currency configuration is working or not 
@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration configuration;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retriveAllCourses() {
		return configuration;
	}
}
