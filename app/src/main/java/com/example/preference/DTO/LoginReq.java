package com.example.preference.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class LoginReq {

    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("nickname")
    private String nickname;
    @SerializedName("birth")
    private Date birth;
    @SerializedName("gender")
    private String gender;
    @SerializedName("notes")
    private String notes;

    @Override
    public String toString() {
        return "LoginReq{" +
                "email=" + email +
                "password=" + password +
                "nickname=" + nickname +
                "birth=" + birth +
                "gender=" + gender +
                "notes=" + notes +

                '}';
    }
}
