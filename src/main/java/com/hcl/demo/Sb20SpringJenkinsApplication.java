package com.hcl.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Sb20SpringJenkinsApplication {

	static Logger logger = LoggerFactory.getLogger(Sb20SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application is started...");
	}
	public static void main(String[] args) {
		logger.info("Main Method is executing...");
		SpringApplication.run(Sb20SpringJenkinsApplication.class, args);
	}

}
