package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanInjectionApplication.class, args);
	}

	@Bean
	public MessageService getMessageService() {
		return new MessageService();
	}

}
