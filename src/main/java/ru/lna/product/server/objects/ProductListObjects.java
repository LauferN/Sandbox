package ru.lna.product.server.objects;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
@Getter
@Setter
public class ProductListObjects {
    Long id;
    String name;
    Long groupId;
}
