package com.nexcommerce.api.dto.product;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    
    private String name;
    private String description;
    private UUID categoryId;
    private BigDecimal price;
    private int stockQuantity;
    private String imageUrl;
    private boolean active;

}
