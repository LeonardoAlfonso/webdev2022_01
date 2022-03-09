package com.webdev.productsystem.Users.User.Domain.ValueObjects;

import com.webdev.productsystem.Shared.Domain.Aggregate.BooleanValueObject;

public class UserIsSeller extends BooleanValueObject {

    private UserIsSeller() {}

    public UserIsSeller(Boolean value) {
        this.value = value;
    }
}
