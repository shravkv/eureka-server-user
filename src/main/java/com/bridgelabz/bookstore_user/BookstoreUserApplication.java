package com.bridgelabz.bookstore_user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class BookstoreUserApplication {
    
    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(BookstoreUserApplication.class, args);
    }

}
