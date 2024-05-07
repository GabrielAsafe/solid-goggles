package com.microservices.SpringClowdConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SproinClowdConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SproinClowdConfigServerApplication.class, args);
	}


	//http://localhost:8888/limits-service/default
}
