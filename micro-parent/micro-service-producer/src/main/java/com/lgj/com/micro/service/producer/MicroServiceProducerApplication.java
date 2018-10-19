package com.lgj.com.micro.service.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class MicroServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProducerApplication.class, args);
	}
}
