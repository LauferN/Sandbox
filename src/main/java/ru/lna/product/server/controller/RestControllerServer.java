package ru.lna.product.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.lna.product.server.objects.ProductListObjects;
import ru.lna.product.server.services.ProductListServiceServer;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestControllerServer {
    ProductListServiceServer productListServiceServer;

    @PostMapping("/product")
    public List<ProductListObjects> getProducts() {
        return productListServiceServer.getProductListAll();
    }
    @PostMapping("product/{id}")
    public ProductListObjects getProductById(@PathVariable("id") Long idProduct) {
        return productListServiceServer.getProductListById(idProduct);
    }
    @PostMapping("/product/name")
    public ProductListObjects getProductByName(@RequestParam String nameProduct) {
        return productListServiceServer.getProductByName(nameProduct);
    }
    @PostMapping("/product/{groupId}/group")
    public List<ProductListObjects> getProductByGroupId(@PathVariable("groupId") Long groupId) {
        return productListServiceServer.getProductByGroupId(groupId);
    }

}