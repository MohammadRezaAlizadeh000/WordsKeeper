package com.mra.wordskeeper.screen.addNewWord

import androidx.lifecycle.ViewModel
import com.mra.wordskeeper.model.WordEntity

class AddNewWordViewModel: ViewModel() {

    fun addWordToDB(wordEntity: WordEntity): Boolean {
        return true
    }
}