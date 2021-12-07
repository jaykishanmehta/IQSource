package com.interview.junction.IQSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class IqSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IqSourceApplication.class, args);
	}

}
