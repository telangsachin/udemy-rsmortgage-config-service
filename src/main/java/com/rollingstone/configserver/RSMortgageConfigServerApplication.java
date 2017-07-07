package com.rollingstone.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
public class RSMortgageConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RSMortgageConfigServerApplication.class, args);
	}
}
