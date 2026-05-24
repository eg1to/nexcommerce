package com.nexcommerce.api.dto.orderItem;

import com.nexcommerce.api.dto.product.ProductSummaryDTO;
import java.math.BigDecimal;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemResponseDTO {
    private UUID id;
    private ProductSummaryDTO product;
    private UUID orderId;
    private int quantity;
    private BigDecimal unitPrice;
}
