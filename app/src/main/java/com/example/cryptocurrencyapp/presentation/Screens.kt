package com.example.cryptocurrencyapp.presentation

sealed class Screens(val route:String) {
    object StartingScreen : Screens("starting_screen")
    object CoinListScreen : Screens("coin_list_screen")
    object CoinDetailScreen : Screens("coin_detail_screen/{coinId}") {
        fun createRoute(coinId: String): String {
            return "coin_detail_screen/$coinId"
        }
    }
}