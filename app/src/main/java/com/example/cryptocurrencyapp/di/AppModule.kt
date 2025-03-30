package com.example.cryptocurrencyapp.di

import com.example.cryptocurrencyapp.data.remote.API.Coinpaprika
import com.example.cryptocurrencyapp.data.repository.CoinrepositoryImplementation
import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//Dependency injection is a way to provide the objects (like your network service and repository)
// that your app needs, instead of creating them everywhere manually.
@Module
@InstallIn(SingletonComponent::class)
object AppModule{

    @Provides
    @Singleton
    fun providesPaprikaAPI():Coinpaprika{
        return Retrofit.Builder()
            .baseUrl("https://api.coinpaprika.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Coinpaprika::class.java)

    }

    @Provides
    @Singleton
    fun providesRepository(api:Coinpaprika): CoinRepository {
        return CoinrepositoryImplementation(api)
    }




}