package com.example.cryptocurrencyapp.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptocurrencyapp.common.Resource
import com.example.cryptocurrencyapp.domain.use_case.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
): ViewModel(){
    private val _state= mutableStateOf(CoinlistState())
    val state: State<CoinlistState> =_state

    init {
        getCoins()
    }

    private fun getCoins(){
        getCoinsUseCase().onEach { result->
            when(result){
                is Resource.Success->{
                    _state.value=CoinlistState(coins = result.data?: emptyList())

                }
                is Resource.Error->{
                    _state.value=CoinlistState(error = result.message?:"An unexpected error occured")

                }
                is Resource.Loading->{
                    _state.value=CoinlistState(isLoading = true)
                }

            }
        }.launchIn(viewModelScope)
    }



}