package com.capgemini.notification_service;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class FounderlinkNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FounderlinkNotificationServiceApplication.class, args);
	}

}
