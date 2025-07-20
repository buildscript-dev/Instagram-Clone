package com.example.instagram.presentation.screens.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.R
import com.example.instagram.presentation.theme.Orange


@Composable
fun LazyStoryRow(){

    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(10) { item ->

            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)  {
                Box(
                    modifier = Modifier.padding(4.dp)
                        .border(2.dp, color = Orange, shape = RoundedCornerShape(100.dp))
                        .clip(RoundedCornerShape(100.dp))
                ){
                    Image(
                        painter = painterResource(id = R.drawable.demo),
                        contentDescription = "Story Image"
                    )
                }
                Text(text = "subratTandon", fontSize = 11.sp, color = Color.Gray,
                    overflow = TextOverflow.Ellipsis)

            }
        }

    }
}

