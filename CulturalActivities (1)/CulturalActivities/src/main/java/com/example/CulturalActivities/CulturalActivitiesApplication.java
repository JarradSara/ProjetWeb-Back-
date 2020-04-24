package com.example.CulturalActivities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CulturalActivitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CulturalActivitiesApplication.class, args);
	}

}
