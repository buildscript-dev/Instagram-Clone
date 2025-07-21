package com.example.instagram


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instagram.presentation.navigation.BottomNavigationBar
import com.example.instagram.presentation.screens.AddScreen.AddScreen
import com.example.instagram.presentation.screens.HomeScreen.HomeScreen
import com.example.instagram.presentation.screens.ProfileScreen.ProfileScreen
import com.example.instagram.presentation.screens.ReelScreen.ReelScreen
import com.example.instagram.presentation.screens.SearchScreen.SearchScreen

@Composable
fun MainScreen(){

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ){
        paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = Modifier.padding(paddingValues)
        )
        {
            composable("Home") { HomeScreen() }
            composable("Search") { SearchScreen() }
            composable("Add") { AddScreen() }
            composable("Reel") { ReelScreen() }
            composable("Profile") { ProfileScreen() }
        }
    }
}

