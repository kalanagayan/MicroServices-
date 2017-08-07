package com.example.cloud.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//create application.yml , by using that file this application act as a eureka server.
//not a client. @EnableEurekaServer if we use this annotaion it has both client and server configuration
@EnableEurekaServer
@SpringBootApplication
public class DemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}
}
