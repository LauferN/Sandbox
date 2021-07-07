package ru.lna.product.server.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import ru.lna.product.server.entity.ProductList;
import ru.lna.product.server.exceptions.NoDataFoundException;
import ru.lna.product.server.objects.ProductListObjects;
import ru.lna.product.server.repository.ProductListCrudRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductListServiceServer {
    private ProductListCrudRepository productListCRUDRepository;
    public List<ProductListObjects> getProductListAll() {
        Iterable<ProductList> iterator = productListCRUDRepository.findAll();
        List<ProductListObjects> productListObjectsList = new ArrayList<>();
        iterator.forEach(
                productList -> {
                    productListObjectsList.add(new ProductListObjects(productList.getId(), productList.getName(), productList.getGroupId()));
                }
        );
        return productListObjectsList;
    }
    public ProductListObjects getProductListById(Long id) {
        ProductList productList = productListCRUDRepository.findById(id).orElseThrow(NoDataFoundException::new);
        return new ProductListObjects(productList.getId(), productList.getName(), productList.getGroupId());

    }
    public ProductListObjects getProductByName(String name) {
        ProductList productList = productListCRUDRepository.findByName(name);
        return new ProductListObjects(productList.getId(), productList.getName(), productList.getGroupId());
    }
    public List<ProductListObjects> getProductByGroupId(Long groupId) {
        Iterable<ProductList> productList = productListCRUDRepository.findAllByGroupId(groupId);
        List<ProductListObjects> listObjects = new ArrayList<>();
        productList.forEach(productList1 -> {
            listObjects.add(new ProductListObjects(productList1.getId(), productList1.getName(), productList1.getGroupId()));
        }
        );
        return listObjects;
    }

}
