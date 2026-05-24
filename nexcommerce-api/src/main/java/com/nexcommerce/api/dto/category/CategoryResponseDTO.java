package com.nexcommerce.api.dto.category;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResponseDTO {

    private UUID id;
    private String name;
    private String description;
    
}
