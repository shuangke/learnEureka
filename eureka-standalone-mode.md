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
4. check the eureka dashboard
   <img width="1421" height="842" alt="image" src="https://github.com/user-attachments/assets/b9518a02-a8d5-41d5-80a1-52daab364f8a" /> </br>

# 创建上游服务Order和下游服务Stock
## 创建上游服务Order Service
1. 创建上游服务Order springboot module并添加依赖
<img width="792" height="719" alt="image" src="https://github.com/user-attachments/assets/5fe88e03-b1a2-452b-81bc-c7d1fd40e0fb" /> </br>

2. config order service through application.yml
``` java
server:
  port: 8001

spring:
  application:
    name: order-service

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/ # the address of the Eureka server that the service will register with 指定将这个order服务注册到哪台eureka服务器上

```
3. 给Order服务的启动类添加@EnableDiscoveryClient tag
<img width="1197" height="572" alt="image" src="https://github.com/user-attachments/assets/bdbab183-2ef7-4bb5-8477-40232d7cb482" /> </br>

4. check the eureka dashboard and see if order service registered successfully
<img width="1226" height="897" alt="image" src="https://github.com/user-attachments/assets/91a5dcbe-cc4d-4be9-bcb7-b7b68b17b276" /> </br>

## 如法炮制像创建Order Service那样创建下游服务Stock Service

## Stimulate Order Service cluster
<img width="625" height="242" alt="image" src="https://github.com/user-attachments/assets/2a03b1c3-02a9-4967-ac63-90ee89995783" />

copy order service configuration
<img width="809" height="688" alt="image" src="https://github.com/user-attachments/assets/9f42c4e0-f863-4c5a-9788-725a0faee7b4" />

<img width="799" height="543" alt="image" src="https://github.com/user-attachments/assets/646ccc7b-d82b-4708-8fdb-6c739e19e0ca" />

<img width="636" height="625" alt="image" src="https://github.com/user-attachments/assets/e72013c0-d0af-4a7a-8e5d-e08d8b854052" />
<img width="790" height="561" alt="image" src="https://github.com/user-attachments/assets/b147ba46-bf40-462d-8d33-60ca27dc43fa" />
<img width="796" height="675" alt="image" src="https://github.com/user-attachments/assets/79e8836e-814c-42b0-9fa5-ce1e00fc3329" />

### there are two order services are registered with this eureka server
<img width="1241" height="780" alt="image" src="https://github.com/user-attachments/assets/d7734fe8-041b-464d-a5d3-0fb70d75d0e1" />




