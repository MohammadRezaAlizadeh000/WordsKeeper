package com.mra.wordskeeper.screen.allWordsScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.mra.wordskeeper.navigation.WordsKeeperScreens
import com.mra.wordskeeper.utils.ADD_YOUR_FIRST_WORD
import com.mra.wordskeeper.utils.EMPTY_WORDS_LIST_TEXT
import com.mra.wordskeeper.utils.Paddings

@Composable
fun AllWordsScreen(
    navController: NavController,
    viewModel: AllWordsViewModel = viewModel()
) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
    ) {

        if (viewModel.wordsList.isEmpty())
            EmptyWordsListList(navController)

    }
}

@Composable
fun EmptyWordsListList(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = EMPTY_WORDS_LIST_TEXT)

        Spacer(modifier = Modifier.padding(bottom = Paddings.padding8))

        Button(onClick = {
            navController.navigate(WordsKeeperScreens.AddNewWordScreen.name)
        }) {
            Text(text = ADD_YOUR_FIRST_WORD)
        }
    }
}