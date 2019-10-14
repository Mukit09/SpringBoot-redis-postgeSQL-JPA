package com.example.demoNaz;

import com.example.demoNaz.service.ThreadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@Slf4j
public class DemoNazApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoNazApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("Application Started !!!");
		ThreadService service = new ThreadService();
		Thread thread = new Thread(service);
		thread.start();
		log.debug("Application Started Successfully");
	}
}
