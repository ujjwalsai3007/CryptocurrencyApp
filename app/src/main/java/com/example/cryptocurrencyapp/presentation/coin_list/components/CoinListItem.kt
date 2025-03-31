package com.example.cryptocurrencyapp.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.cryptocurrencyapp.domain.model.Coin
import androidx.compose.ui.text.style.TextAlign.Companion as TextAlign1


@Composable
fun CoinListItem(
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
    Row(
        modifier=Modifier.fillMaxWidth()
            .clickable { onItemClick(coin) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text="${coin.rank}.${coin.name} (${coin.symbol})",
            style= MaterialTheme.typography.bodyMedium,
            overflow= TextOverflow.Ellipsis
            )
        Text(
            text = if(coin.is_active) "active" else "inactive",
            color = if(coin.is_active) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.scrim,
            fontStyle = MaterialTheme.typography.bodyMedium.fontStyle,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(Alignment.CenterVertically),
            textAlign = TextAlign1.End
        )


    }


}