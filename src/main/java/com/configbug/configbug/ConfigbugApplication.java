package com.configbug.configbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigbugApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigbugApplication.class, args);
	}

}
