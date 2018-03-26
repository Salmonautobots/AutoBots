package com.salmon.test.models.cucumber;

import lombok.Getter;

/**
 * Created by aherappa on 13/12/2017.
 */


@Getter
public class RegistrationModel {
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String confirmPassword;
    private String mobileNumber;
    private String errorMsg;


}
