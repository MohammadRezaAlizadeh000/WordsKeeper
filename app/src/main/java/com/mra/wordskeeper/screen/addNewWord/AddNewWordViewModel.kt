package com.mra.wordskeeper.screen.addNewWord

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mra.wordskeeper.domin.InsertWordUseCase
import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class AddNewWordViewModel @Inject constructor(
    private val insertWordUseCase: InsertWordUseCase
): ViewModel() {

    private var job: Job? = null
    private val _insertResultFlow: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val insertResultFlow: MutableStateFlow<Boolean> = _insertResultFlow

    fun addWordToDB(wordEntity: WordEntity) {
        job = viewModelScope.launch {
            insertWordUseCase(wordEntity).collect {
                _insertResultFlow.value = it
            }
        }
    }
}