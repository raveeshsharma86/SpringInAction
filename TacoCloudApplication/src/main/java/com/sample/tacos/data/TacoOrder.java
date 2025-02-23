package com.sample.tacos.data;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    private DeliveryAddress deliveryAddress;
    private CreditCardDetails creditCardDetails;
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
