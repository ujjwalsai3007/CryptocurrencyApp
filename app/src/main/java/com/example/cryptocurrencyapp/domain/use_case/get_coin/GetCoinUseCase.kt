package com.example.cryptocurrencyapp.domain.use_case.get_coin

import com.example.cryptocurrencyapp.common.Resource
import com.example.cryptocurrencyapp.data.remote.dto.toCoin
import com.example.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.example.cryptocurrencyapp.domain.model.Coin
import com.example.cryptocurrencyapp.domain.model.CoinDetail
import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinID:String): Flow<Resource<CoinDetail>> = flow{
        try{
            emit(Resource.Loading())
            val coins = repository.getCoinsBYId(coinID).toCoinDetail()
            emit(Resource.Success(coins))

        }catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage?:"An unexpected error occured"))

        }catch (e:IOException){
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))

        }

    }
}