package com.example.uipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
                .size(size = 150.dp)
                .padding(all = 2.dp)
                .clip(RoundedCornerShape(100.dp))
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
//          //otomatis memberikan jarak menggunakan spaceBy
            horizontalArrangement = Arrangement.spacedBy(3.dp),
            modifier = Modifier.padding(10.dp)
        ) {
            val gambarList = listOf(
                R.drawable.instagram,
                R.drawable.x,
                R.drawable.facebook,
                R.drawable.tiktok
            )

            gambarList.forEach { gambar ->
                Image(
                    painter = painterResource(id = gambar),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(100.dp))
                )
            }
        }

        Column(
            modifier = Modifier.padding(all = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.nama),
                fontSize = 25.sp
            )
            Text(text = stringResource(id = R.string.desc),
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(height = 15.dp))

        Card(modifier= Modifier
            .height(height = 120.dp)
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){

        }

        Card(modifier= Modifier
            .height(height = 120.dp)
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){

        }

        Card(modifier= Modifier
            .height(height = 120.dp)
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){

        }

    }
}