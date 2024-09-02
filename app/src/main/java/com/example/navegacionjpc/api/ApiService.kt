package com.example.navegacionjpc.api

import retrofit2.Call
import com.example.navegacionjpc.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<User>>
}