package com.salmon.test.models.cucumber;

import lombok.Data;

@Data
public class CreditCardModel {

    String cardName;
    String type;
    String number;
    String expiryMonth;
    String expiryYear;
    String securityCode;
    String email;
 }