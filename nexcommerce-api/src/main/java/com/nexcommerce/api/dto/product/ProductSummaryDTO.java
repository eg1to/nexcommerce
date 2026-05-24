package com.nexcommerce.api.dto.product;

import com.nexcommerce.api.dto.category.CategorySummaryDTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProductSummaryDTO {
    private UUID id;
    private String name;
    private String description;
    private String imageUrl;
    private BigDecimal price;
    private CategorySummaryDTO category;
}