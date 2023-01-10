package com.mra.wordskeeper.screen.addNewWord

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.mra.wordskeeper.utils.Paddings

@Composable
fun AddNewWordScreen(
    navController: NavController,
    viewModel: AddNewWordViewModel = viewModel()
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "This is Add word page",
            color = Color.Black,
            fontSize = Paddings.fontSize25,
            fontWeight = FontWeight.Bold
        )
    }
}