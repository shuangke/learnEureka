# Build Eureka server in standalone mode
1. create springboot module:
   ```
   add dependencies:
     SpringCloud Discovery --> eureka server
   ```
2. config the eureka server by creating application.yml   
```
server:
  port: 8761

spring:
    application:
        name: eureka-server
eureka:
    client:
        fetch-registry: false # Do not fetch registry from other Eureka servers(for standalone mode)
        service-url:
            defaultZone: http://localhost:8761/eureka/ # URL for the Eureka server to register with itself
```

3. add @EnableEurekaServer tag to entry point of the eureka server modlue
   ``` java
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

   ```
