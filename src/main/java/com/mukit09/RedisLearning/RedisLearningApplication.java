package com.mukit09.RedisLearning;

import com.mukit09.RedisLearning.service.ThreadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@Slf4j
public class RedisLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisLearningApplication.class, args);
	}

}
