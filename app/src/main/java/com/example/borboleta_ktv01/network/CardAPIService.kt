package com.example.borboleta_ktv01.network

import com.example.borboleta_ktv01.models.card
import retrofit2.http.GET

interface cardAPIService {
    @GET("posts")
    suspend fun getCards(): List<card>
}
