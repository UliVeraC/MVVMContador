package com.example.contadormvvm.Counter.View

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterValue(){
    Text(text = "10",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 54.dp))
}