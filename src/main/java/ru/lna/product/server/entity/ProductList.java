package ru.lna.product.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_LIST")
@Getter
@Setter
public class ProductList {
    @Id
    Long id;
    String name;
    Long groupId;
}
