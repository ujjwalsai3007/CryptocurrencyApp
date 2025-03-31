package com.example.cryptocurrencyapp.presentation.coin_detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun CoinTag(
    tag: String
) {
    Box(
        modifier=Modifier.border(
            width = 1.dp,
            color = MaterialTheme.colorScheme.primary,
            shape = RoundedCornerShape(100.dp)
        )
    ){

    }

}