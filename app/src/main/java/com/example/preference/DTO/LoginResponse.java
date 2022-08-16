package com.example.preference.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class LoginResponse {

    @SerializedName("userId")
    private String userId;

    @SerializedName("email")
    private String email;

    @Override
    public String toString() {
        return "PostResult{" +
                "userId=" + email +
                '}';
    }

}
