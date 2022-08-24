package com.spring_ej53.ej5.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Application {

	@Autowired
	private ControladorLogger loggingSystem;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	/*	log.trace("Mensaje a nivel de TRACE");
		log.debug("Mensaje a nivel de DEBUG");
		log.info("Mensaje a nivel de INFO");
		log.warn("Mensaje a nivel de WARNING");
		log.error("Mensaje a nivel de ERROR");*/


	}



}