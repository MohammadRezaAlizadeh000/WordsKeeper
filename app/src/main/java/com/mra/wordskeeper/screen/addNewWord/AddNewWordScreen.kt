package com.mra.wordskeeper.screen.addNewWord

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.mra.wordskeeper.model.WordEntity
import com.mra.wordskeeper.utils.*
import kotlinx.coroutines.launch

var wordState: MutableState<String>? = null
var descriptionState: MutableState<String>? = null

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
@Preview
fun AddNewWordScreen(
    navController: NavController? = null,
    viewModel: AddNewWordViewModel = viewModel()
) {

    val context = LocalContext.current
    wordState = remember { mutableStateOf("") }
    descriptionState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = Paddings.padding8)
                    .padding(top = Paddings.padding8),
                value = wordState?.value ?: "",
                singleLine = true,
                onValueChange = {
                    if (it.length <= 20) wordState?.value = it
                },
                label = {
                    Text(text = ENTER_YOUR_WORD_LABEL)
                }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = Paddings.padding8)
                    .padding(top = Paddings.padding8),
                value = descriptionState?.value ?: "",
                minLines = 3,
                maxLines = 6,
                onValueChange = {
                    if (it.length <= 100) descriptionState?.value = it
                },
                label = {
                    Text(text = DESCRIPTION)
                }
            )

        }

        Button(
            onClick = {

                wordState?.let {
                    if (it.value.isNotEmpty()) {
                        if (viewModel.addWordToDB(
                                WordEntity(
                                    1, it.value, descriptionState?.value
                                )
                            )
                        ) {
                            context.toast(WORD_ADDED_SUCCESSFULLY)
                            navController?.popBackStack()
                        } else
                            context.toast(NOT_SUCCESSFUL_MESSAGE)
                    } else
                        context.toast(WORD_IS_EMPTY_ERROR)
                }
            },
            modifier = Modifier
                .weight(1F, false)
                .fillMaxWidth()
                .padding(
                    start = Paddings.padding8,
                    end = Paddings.padding8,
                    bottom = Paddings.padding8
                )
        ) {
            Text(text = ADD_WORD)
        }

    }
}