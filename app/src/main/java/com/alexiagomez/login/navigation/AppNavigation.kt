package com.alexiagomez.login.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexiagomez.login.screens.LoginScreen
import com.alexiagomez.login.screens.MainScreen
import com.alexiagomez.login.screens.RegisterScreen
import com.alexiagomez.login.screens.WelcomeScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "main"
    ){
        composable("welcome"){
            WelcomeScreen(navController)
        }
        composable("login"){
            LoginScreen(navController)
        }
        composable("register"){
            RegisterScreen(navController)
        }
        composable("main"){
            MainScreen(navController)
        }
    }
}