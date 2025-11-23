package com.foodexpress.repository;

import com.foodexpress.entity.User;
import com.foodexpress.entity.Order;
import com.foodexpress.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByRestaurant(Restaurant restaurant);

    List<Order> findByUser(User user);

    List<Order> findByDeliveryBoy(User user);

}
