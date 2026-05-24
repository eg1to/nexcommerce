package com.nexcommerce.api.dto.product;

import com.nexcommerce.api.dto.category.CategorySummaryDTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProductResponseDTO {

    private UUID id;
    private String name;
    private String description;
    private CategorySummaryDTO category;
    private BigDecimal price;
    private int stockQuantity;
    private String imageUrl;
    private boolean active;

}
