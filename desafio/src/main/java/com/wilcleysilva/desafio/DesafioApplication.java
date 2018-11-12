package com.wilcleysilva.desafio;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesafioApplication {

	public static void main(String[] pArgs) {
		SpringApplication.run(DesafioApplication.class, pArgs);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext pCtx) {
		return pArgs -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = pCtx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};

	}
}
