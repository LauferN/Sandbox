package ru.lna.product.server.rqrs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseProductList {
    private Long id;
    private String name;
    private String groupId;

}
