package com.example.cryptocurrencyapp.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cryptocurrencyapp.presentation.StartingScreen.StartingScreen
import com.example.cryptocurrencyapp.presentation.coin_detail.CoinDetailScreen
import com.example.cryptocurrencyapp.presentation.coin_list.components.CoinListScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.StartingScreen.route
    ) {
        composable(
            route = Screens.StartingScreen.route
        ) {
            StartingScreen(
                onStartClicked = {
                    navController.navigate(Screens.CoinListScreen.route)
                }
            )
        }
        
        composable(
            route = Screens.CoinListScreen.route
        ) {
            CoinListScreen(navController)
        }
        
        composable(
            route = Screens.CoinDetailScreen.route
        ) {
            CoinDetailScreen(navController)
        }
    }
} 