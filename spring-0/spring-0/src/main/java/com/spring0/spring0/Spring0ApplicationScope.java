package com.spring0.spring0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring0.spring0.scope.PersonDAO;


@SpringBootApplication
public class Spring0ApplicationScope {
	
	private static Logger logger = LoggerFactory.getLogger(Spring0ApplicationScope.class); 

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring0ApplicationScope.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		logger.info("{}", personDAO);
		logger.info("{}", personDAO.getJdbcConnection());
		logger.info("{}", personDAO2);
		logger.info("{}", personDAO2.getJdbcConnection());
	}

}
