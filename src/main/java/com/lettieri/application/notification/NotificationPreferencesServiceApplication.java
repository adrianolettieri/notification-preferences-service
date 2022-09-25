package com.lettieri.application.notification;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NotificationPreferencesServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(NotificationPreferencesServiceApplication.class, args);
	}



}
