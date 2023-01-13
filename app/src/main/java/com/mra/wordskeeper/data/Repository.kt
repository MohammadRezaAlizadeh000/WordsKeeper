package com.mra.wordskeeper.data

import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun addWord(word: WordEntity): Flow<Boolean>

    suspend fun getAllWords(): Flow<List<WordEntity>>
}