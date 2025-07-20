package com.example.instagram.presentation.components

import androidx.compose.ui.graphics.Brush
import com.example.instagram.presentation.theme.Blue
import com.example.instagram.presentation.theme.DarkOrange
import com.example.instagram.presentation.theme.DarkPink
import com.example.instagram.presentation.theme.LightYellow
import com.example.instagram.presentation.theme.Orange
import com.example.instagram.presentation.theme.Purple
import com.example.instagram.presentation.theme.PurpleRed
import com.example.instagram.presentation.theme.Red
import com.example.instagram.presentation.theme.RoyalBlue
import com.example.instagram.presentation.theme.Yellow

    val instaGradient = Brush.linearGradient(
        colors = listOf(
            RoyalBlue,
            Blue,
            Purple,
            DarkPink,
            PurpleRed,
            Red,
            DarkOrange,
            Orange,
            Yellow,
            LightYellow
        )
    )



//Box(
//modifier = Modifier
//.fillMaxSize()
//.background(brush = instaGradient)
//)
