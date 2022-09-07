package com.Conduira.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Bean.xml")
public class SpringapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapplicationApplication.class, args);
	}

}
