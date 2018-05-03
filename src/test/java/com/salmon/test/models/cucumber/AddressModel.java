package com.salmon.test.models.cucumber;

import lombok.Data;
import lombok.Getter;

@Data

public class AddressModel {
    public String firstName;
    private String lastName;
    public String address1;
    public String city;
    public String postCode;
    public String phone;
}
