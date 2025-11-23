package com.foodexpress.dto;

import com.foodexpress.entity.enums.OrderStatus;
import com.foodexpress.entity.enums.PaymentMode;
import com.foodexpress.entity.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlaceRequest {
    private String userId;
    private String address;
    private String restaurantId;
    private OrderStatus status = OrderStatus.PLACED;
    private LocalDateTime orderedAt = LocalDateTime.now();
    private PaymentStatus paymentStatus = PaymentStatus.NOT_PAID;
    private PaymentMode paymentMode;
}
