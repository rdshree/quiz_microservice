package com.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizSeviceApplication.class, args);
	}

}
