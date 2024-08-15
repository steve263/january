package com.example.mobileapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobileapp.ui.theme.screens.about.AboutScreen
import com.example.mobileapp.ui.theme.screens.about.AboutScreen
import com.example.mobileapp.ui.theme.screens.clients.AddClient
import com.example.mobileapp.ui.theme.screens.clients.UpdateClient
import com.example.mobileapp.ui.theme.screens.home.HomeScreen
import com.example.mobileapp.ui.theme.screens.login.Login
import com.example.mobileapp.ui.theme.screens.register.Greeting

@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
               startDestination:String = ROUTE_REGISTER){

    NavHost(navController=navController,
        startDestination=startDestination){
        composable(ROUTE_REGISTER){ Greeting("Brian",navController)}
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_LOGIN){ Login(navController)}
        composable(ROUTE_ABOUT){ AboutScreen(navController)}
        composable(ROUTE_ADD_CLIENT){ AddClient(navController)}
        composable(ROUTE_UPDATE_CLIENT){ UpdateClient(navController)}
}
}