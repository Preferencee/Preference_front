package com.example.preference.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class LoginRes {

    @SerializedName("userId")
    private Integer userId;

    @SerializedName("email")
    private String email;

    @Override
    public String toString() {
        return "PostResult{" +
                "userId=" + email +
                '}';
    }
}
