package com.example.naas.repository

import com.example.naas.api.RetrofitInstance
import com.example.naas.data.ReasonResponse

class ApiRepository {
    suspend fun getMessage(): ReasonResponse {
        return RetrofitInstance.api.getReason()
    }
}