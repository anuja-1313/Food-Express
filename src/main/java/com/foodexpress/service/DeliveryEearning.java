package com.foodexpress.service;

import com.foodexpress.dto.DeliveryEarningDto;

import java.util.List;

public interface DeliveryEearning {

    List<DeliveryEarningDto> getDeliveryEarningByDeliveryBoy(String deliveryBoyId);

}
