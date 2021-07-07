package ru.lna.product.client.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.lna.product.client.services.ProductListServiceClient;

@RestController
@AllArgsConstructor
public class ProductRestControllerClient {
    ProductListServiceClient productListServiceClient;

    @GetMapping("/product")
    public String getProducts() {
        return productListServiceClient.getProductListAll();
    }
    @GetMapping("/product/id/{id}")
    public String getProductById(@PathVariable(name = "id") Long id) {
        return productListServiceClient.getProductListById(id);
    }
    @GetMapping("/product/name/{name}")
    public String getProductByName(@PathVariable(name = "name") String name) {
        return productListServiceClient.getProductListByName(name);
    }
    @GetMapping("/product/group/{groupId}")
    public String getProductByGroupId(@PathVariable(name = "groupId") Long groupId) {
        return productListServiceClient.getProductListByGroupId(groupId);
    }
}
