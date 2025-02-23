package com.sample.tacos.data;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DeliveryAddress {
    @NotBlank(message="Delivery name is required")
    private String deliveryName;
    @NotBlank(message="Delivery street is required")
    private String deliveryStreet;
    @NotBlank(message="Delivery city is required")
    private String deliveryCity;
    @NotBlank(message="Delivery state is required")
    private String deliveryState;
    @NotBlank(message="Delivery zip is required")
    private String deliveryZip;
}
