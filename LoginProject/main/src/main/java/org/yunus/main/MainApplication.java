package org.yunus.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "org.yunus.entities")
@EnableJpaRepositories(basePackages = "org.yunus.repository")
@ComponentScan(basePackages = {"org.yunus.service", "org.yunus.security", "org.yunus.controller"})
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}

