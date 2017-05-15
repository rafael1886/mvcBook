package com.book.enums;

import java.io.Serializable;

/**
 * Created by rafael on 25.03.17.
 */
public enum UserProfileType implements Serializable {
    USER("user"),
    ADMIN("admin");

    String userProfileType;

    private UserProfileType(String userProfileType) {
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType() {
        return userProfileType;
    }

}