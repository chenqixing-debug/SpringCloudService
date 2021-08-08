package com.cqx.servicea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServiceAApplication.class);
    public static void main(String[] args) {
        logger.info("----------service-a Run Success----------");
        SpringApplication.run(ServiceAApplication.class, args);
        System.out.println("----------service-a Run Success----------");
    }

}
