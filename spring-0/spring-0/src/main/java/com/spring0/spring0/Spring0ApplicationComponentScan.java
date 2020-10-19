package com.spring0.spring0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring0.spring0.componentscan.ComponentDAO;


@SpringBootApplication
public class Spring0ApplicationComponentScan {
	
	private static Logger logger = LoggerFactory.getLogger(Spring0ApplicationComponentScan.class); 

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring0ApplicationComponentScan.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		logger.info("{}", componentDAO);
	}

}
