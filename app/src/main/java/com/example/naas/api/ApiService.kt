package com.example.naas.api

import com.example.naas.data.ReasonResponse;
import retrofit2.http.GET

interface ApiService {
    @GET("/no")
    suspend fun getReason(): ReasonResponse
}