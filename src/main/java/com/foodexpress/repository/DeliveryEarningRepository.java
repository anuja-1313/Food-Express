package com.foodexpress.repository;

import com.foodexpress.entity.DeliveryEarning;
import com.foodexpress.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DeliveryEarningRepository extends JpaRepository<DeliveryEarning, Long> {


    List<DeliveryEarning> findByDeliveryBoy(User deliveryBoy);


}
