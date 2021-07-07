package ru.lna.product.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.lna.product.server.entity.ProductList;

import java.util.List;

@Repository
public interface ProductListCrudRepository extends CrudRepository<ProductList, Long> {
    ProductList findByName(String name);
    List<ProductList> findAllByGroupId(Long groupId);
}


