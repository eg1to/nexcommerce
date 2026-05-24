package com.nexcommerce.api.dto.order;

import com.nexcommerce.api.dto.orderItem.OrderItemRequestDTO;


import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDTO {
    
    private UUID userId;
    private UUID addressId;
    private List<OrderItemRequestDTO> items;

}
