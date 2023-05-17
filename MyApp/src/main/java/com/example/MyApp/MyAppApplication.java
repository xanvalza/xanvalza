package com.example.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		System.out.println(context.getApplicationName());
	}

}
