package com.example.mycomposeproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.mycomposeproject.navigation.destinations.listComposable
import com.example.mycomposeproject.navigation.destinations.taskComposable
import com.example.mycomposeproject.util.Constant.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
){
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}