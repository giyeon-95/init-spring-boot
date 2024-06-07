package com.juhodev.springboot.spring_boot_init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfingController {

    	
	@Autowired
	private CurrencyServiceConfig configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfig retrieveAllCourses() {
		return configuration;
	}
}
