package com.example.uipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                .size(size = 200.dp)
                .padding(all = 2.dp)
                .clip(RoundedCornerShape(16.dp))
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(all = 10.dp)
        ) {
            Column() {
                val gambar2 = painterResource(id = R.drawable.instagram)
                Image(
                    painter = gambar2,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 200.dp)
                        .padding(all = 2.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                val gambar3 = painterResource(id = R.drawable.x)
                Image(
                    painter = gambar3,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 200.dp)
                        .padding(all = 2.dp)
                        .clip(RoundedCornerShape(16.dp))
                )

                val gambar4 = painterResource(id = R.drawable.facebook)
                Image(
                    painter = gambar4,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 200.dp)
                        .padding(all = 2.dp)
                        .clip(RoundedCornerShape(16.dp))
                )

                val gambar5 = painterResource(id = R.drawable.tiktok)
                Image(
                    painter = gambar5,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 200.dp)
                        .padding(all = 2.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
        }
    }
}