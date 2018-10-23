package com.lgj.com.micro.service.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:producer.xml")
public class MicroServiceProducerApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProducerApplication.class, args);

	}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MicroServiceProducerApplication.class);
    }
}
