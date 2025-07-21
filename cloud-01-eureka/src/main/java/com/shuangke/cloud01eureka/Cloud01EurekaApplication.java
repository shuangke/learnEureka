package com.shuangke.cloud01eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cloud01EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cloud01EurekaApplication.class, args);
	}

}
