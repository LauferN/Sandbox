package ru.lna.product;

import lombok.extern.java.Log;
import ru.lna.product.client.ProductClient;
import ru.lna.product.server.ProductServer;
@Log
public class App {
    public static void main(String[] args) {
        try {
            if (args[0].equalsIgnoreCase("S")) {
                ProductServer.startServer(args);
            } else if (args[0].equalsIgnoreCase("C")) {
                ProductClient.startClient(args);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            log.info("Inward Parameters is null, please start App with argument, possible value: S - Server, C - Client");
        }

    }
}
