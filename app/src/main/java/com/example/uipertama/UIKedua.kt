package com.example.uipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ActKedua(modifier: Modifier){
    Column(modifier = Modifier
        .padding(top = 100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val gambar1 = painterResource(id = R.drawable.me)
        Image(
            painter = gambar1,
            contentDescription = null,
            modifier = Modifier
                .size(size = 100.dp)
                .padding(all = 2.dp)
        )
    }
}