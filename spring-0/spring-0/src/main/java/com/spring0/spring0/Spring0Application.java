package com.spring0.spring0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring0.spring0.basic.BinarySearchImpl;

@SpringBootApplication
public class Spring0Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring0Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
