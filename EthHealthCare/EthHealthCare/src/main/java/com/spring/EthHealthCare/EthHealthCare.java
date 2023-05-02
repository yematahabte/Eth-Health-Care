package com.spring.EthHealthCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class EthHealthCare {

	public static void main(String[] args) {
		SpringApplication.run(EthHealthCare.class, args);
	}

}
