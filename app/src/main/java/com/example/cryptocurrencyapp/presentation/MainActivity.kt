package com.example.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptocurrencyapp.presentation.coin_detail.CoinListScreen
import com.example.cryptocurrencyapp.presentation.ui.theme.CryptoCurrencyAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoCurrencyAppTheme {
                val navController= rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screens.CoinListScreen.route
                ){
                    composable(
                        route=Screens.CoinListScreen.route
                    ) {
                        CoinListScreen(navController)
                    }
                    composable(
                        route=Screens.CoinDetailScreen.route
                    ) {
                        CoinDetailScreen()
                    }
                }


            }
        }
    }
}

