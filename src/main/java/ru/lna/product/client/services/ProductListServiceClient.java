package ru.lna.product.client.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductListServiceClient {
    public String getProductListAll() {
        RestTemplate template = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<String>("GetAllProductList");
        ResponseEntity<String> response = template.postForEntity("http://127.0.0.1:8081/product/",request, String.class);
        return response.getBody();
    }
    public String getProductListById(Long id) {
        RestTemplate template = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<String>("GetProductListById");
        ResponseEntity<String> response = template.postForEntity("http://127.0.0.1:8081/product/" + id, request, String.class);
        return response.getBody();
    }
    public String getProductListByName(String name) {
        RestTemplate template = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<String>("GetProductListByName");
        ResponseEntity<String> response = template.postForEntity("http://127.0.0.1:8081/product/name?nameProduct=" + name, request, String.class);
        return response.getBody();
    }
    public String getProductListByGroupId(Long groupId) {
        RestTemplate template = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<String>("GetProductListByGroupId");
        ResponseEntity<String> response = template.postForEntity("http://127.0.0.1:8081/product/" + groupId + "/group", request, String.class);
        return response.getBody();
    }
}
