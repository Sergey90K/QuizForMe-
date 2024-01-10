package com.leadsdoit.quizforleadsdoit.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.leadsdoit.quizforleadsdoit.ui.navigation.QuizNavHost
import com.leadsdoit.quizforleadsdoit.ui.startScreen.StartViewModel
import com.leadsdoit.quizforleadsdoit.ui.startScreen.Test


//@Composable
//fun QuizApp(startViewModel : StartViewModel = viewModel(factory = AppViewModelProvider.Factory)){
//    //val uiState by startViewModel.quizUiState.collectAsStateWithLifecycle()
//    //Test()
//   // Log.d("Test", uiState.toString())
//
//}
@Composable
fun QuizApp(navController: NavHostController = rememberNavController()){
    QuizNavHost(navController = navController)
}