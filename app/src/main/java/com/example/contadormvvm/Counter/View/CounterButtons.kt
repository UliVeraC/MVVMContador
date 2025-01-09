package com.example.contadormvvm.Counter.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.contadormvvm.Counter.ViewModel.CounterViewModel

@Composable
fun CounterButtons(counterViewModel: CounterViewModel) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        CounterButton(Icons.Default.KeyboardArrowDown, function = {
            counterViewModel.decrement()
        })
        CounterButton(Icons.Default.KeyboardArrowUp, function = {
            counterViewModel.increment()
        })

    }
}

@Composable
fun CounterButton(icon: ImageVector, function: () -> Unit) {
    FilledIconButton(onClick = { function() }) {
        Icon(imageVector = icon, contentDescription = "")
    }

}