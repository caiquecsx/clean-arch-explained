package com.caiquecsx.mycleanarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MyCleanArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCleanArchitectureApplication.class, args);
	}

}
