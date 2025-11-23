package com.foodexpress.service;

import com.foodexpress.dto.OrderDto;
import com.foodexpress.dto.OrderItemDto;
import com.foodexpress.dto.OrderPlaceRequest;
import com.foodexpress.entity.enums.OrderStatus;

import java.util.List;

public interface OrderService {

    OrderDto placeOrder(OrderPlaceRequest orderPlaceRequest);
    List<OrderDto> getOrders();
    List<OrderDto> getOrderByRestaurant(String restaurantId);
    List<OrderDto> getOrderByUser(String userId);
    List<OrderDto> getOrderByDeliveryBoy(String deliveryBoyId);
    OrderDto tractOrder(Long orderId);
    OrderItemDto cancelOrder(Long orderId);
    OrderDto updateOrderStatus(OrderStatus orderStatus);
    OrderDto updateOrderStataus(OrderStatus orderStatus);


}
