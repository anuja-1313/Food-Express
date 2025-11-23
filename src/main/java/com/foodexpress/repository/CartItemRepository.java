package com.foodexpress.repository;

import com.foodexpress.entity.Cart;
import com.foodexpress.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    List<CartItem> findByCart(Cart cart);

}
