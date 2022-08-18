package com.example.preference.DTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitService {
    // 비밀번호 찾기
    @GET("/users/findPassword")
    fun getPassword(@Query("email")email:String):Call<UserFindPassword>

    // 로그인
    @Headers(“Content-Type:x-www-form-urlencoded”)
    @POST(“/users/login”)
    fun postLogin(@Body body:LoginReq):Call<LoginRes>

    // 로그인 응답
    Data class LoginRes(
            val userId: Integer,
            val email: String
    )
    // 비밀번호 찾기 응답
    Data class UserFindPassword(
            val password: String
    )
    // 로그인 요청
    Data class LoginReq(
            val email: String,
            val password: String
    )
}


