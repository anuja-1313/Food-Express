package com.foodexpress.service;


import com.foodexpress.dto.AddItemToCartRequest;
import com.foodexpress.dto.CartDto;

public interface CartService {

    CartDto addItemToCart(AddItemToCartRequest addItemToCartRequest);

    CartDto getCart(String userId);

    CartDto removeItemFromCart(String cartItemId, String userId);

    CartDto clearCart(String userId);



}
