package com.salmon.test.models.cucumber;

import lombok.Data;

@Data
public class OrderModel {

    String orderNumber;
    String paymentMethod;
    String billingAddress;
    String shippingAddress;
    String productName;
    String size;
    String colour;
    String quantity;
    String price;
}