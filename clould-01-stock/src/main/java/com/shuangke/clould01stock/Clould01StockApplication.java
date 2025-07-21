package com.shuangke.clould01stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Clould01StockApplication {

    public static void main(String[] args) {
        SpringApplication.run(Clould01StockApplication.class, args);
    }

}
