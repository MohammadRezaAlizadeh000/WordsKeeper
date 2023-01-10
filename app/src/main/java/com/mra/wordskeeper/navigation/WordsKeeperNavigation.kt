package com.mra.wordskeeper.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mra.wordskeeper.screen.addNewWord.AddNewWordScreen
import com.mra.wordskeeper.screen.allWordsScreen.AllWordsScreen

@Composable
fun WordsKeeperNavigation() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = WordsKeeperScreens.AllWordsScreen.name) {

        composable(WordsKeeperScreens.AllWordsScreen.name) {
            AllWordsScreen(navController)
        }

        composable(WordsKeeperScreens.AddNewWordScreen.name) {
            AddNewWordScreen(navController)
        }

    }
}