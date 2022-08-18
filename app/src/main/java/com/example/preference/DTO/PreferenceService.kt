package com.example.preference.DTO

import android.telecom.Call

object PreferenceService {
    private const val BASE_URL = “http://ec2-54-180-23-89.ap-northeast-2.compute.amazonaws.com”
    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val service = retrofit.create(PreferenceService::class.java)

    Private fun initNetwork() {
        val requestLoginData = LoginReq(
                email = binding.etId.text.toString(),
                password = binding.etPassword.toString()
        )

        val call: Call<LoginRes> = ServiceCreator.PreferenceService.postLogin(requestLoginData)

        call.enqueue(object : Callback<LoginRes> {
            override fun onResponse(
                    call: Call<LoginRes>,
                    response: Response<LoginRes>
            ) {
                if (response.isSuccessful) {
                    Toast.makeText(this@ServerActivity, “성공”,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
