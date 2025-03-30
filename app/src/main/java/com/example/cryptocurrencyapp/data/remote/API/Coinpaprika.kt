package com.example.cryptocurrencyapp.data.remote.API


import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDTO
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto
import com.example.cryptocurrencyapp.domain.model.Coin
import com.example.cryptocurrencyapp.domain.model.CoinDetail
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Coinpaprika {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>


    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDTO

}