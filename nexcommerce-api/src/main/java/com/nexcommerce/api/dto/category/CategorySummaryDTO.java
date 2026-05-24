package com.nexcommerce.api.dto.category;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;


@Getter
@Setter
public class CategorySummaryDTO {
    
    private UUID id;
    private String name;
    
}