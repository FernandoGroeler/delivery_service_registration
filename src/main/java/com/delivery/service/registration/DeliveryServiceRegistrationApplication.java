package com.delivery.service.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeliveryServiceRegistrationApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "service-registration");
		SpringApplication.run(DeliveryServiceRegistrationApplication.class, args);
	}
}
