package com.amex.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.amex.persistence"})
@EntityScan(basePackages= {"com.amex.domain"})
@ComponentScan(basePackages= {"com.amex.domain","com.amex.persistence","com.amex.web"})
public class EstimatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstimatorApplication.class, args);
	}
}
