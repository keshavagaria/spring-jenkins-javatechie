package com.hcl.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb20SpringJenkinsApplicationTests {

	static Logger logger = LoggerFactory.getLogger(Sb20SpringJenkinsApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Case Executing...");
		logger.info("Test Case Executing again and again...");
		
		assertEquals(true, true);
	}

}
