package ru.lna.product.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:/server.properties")

public class ProductServer {
    public static void startServer(String[] args) {
        SpringApplication.run(ProductServer.class, args);
    }

}
