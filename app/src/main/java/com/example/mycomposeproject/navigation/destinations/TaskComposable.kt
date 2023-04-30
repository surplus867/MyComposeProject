package com.example.mycomposeproject.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mycomposeproject.util.Action
import com.example.mycomposeproject.util.Constant
import com.example.mycomposeproject.util.Constant.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(Constant.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ){

    }
}