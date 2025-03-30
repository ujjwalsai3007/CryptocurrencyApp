package com.example.cryptocurrencyapp.data.repository

import com.example.cryptocurrencyapp.data.remote.API.Coinpaprika
import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDTO
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto

import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinrepositoryImplementation @Inject constructor(
    private val api: Coinpaprika,
):CoinRepository{

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinsBYId(coinId: String): CoinDetailDTO {
        return api.getCoinById(coinId)
    }

}