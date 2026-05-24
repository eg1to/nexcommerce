package com.nexcommerce.api.dto.order;

import com.nexcommerce.api.dto.orderItem.OrderItemResponseDTO;
import com.nexcommerce.api.entities.OrderStatus;
import java.util.UUID;
import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDTO {

    private UUID orderId;
    private UUID userId;
    private UUID addressId;
    private OrderStatus status;
    private BigDecimal totalAmount;
    private List<OrderItemResponseDTO> orderItems;
}
