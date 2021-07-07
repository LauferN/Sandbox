package ru.lna.product.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:/client.properties")
public class ProductClient {
    public static void startClient(String[] args) {
        SpringApplication.run(ProductClient.class, args);
    }
}
