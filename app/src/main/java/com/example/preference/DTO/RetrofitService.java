package com.example.preference.DTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("posts/{/users/emailCheck}")
    Call<LoginReq> getPosts(@Path("/users/emailCheck")String post);
}
