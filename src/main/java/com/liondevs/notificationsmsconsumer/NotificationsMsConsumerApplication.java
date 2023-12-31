package com.liondevs.notificationsmsconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.config.EnableWebFlux;


@SpringBootApplication
@EnableDiscoveryClient
public class NotificationsMsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationsMsConsumerApplication.class, args);
    }

}
