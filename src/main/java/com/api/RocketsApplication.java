package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.api")
@EnableJpaRepositories(basePackages = "com.api.repository")
@EntityScan(basePackages = "com.api.model")
public class RocketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketsApplication.class, args);
	}

}
