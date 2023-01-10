package com.mra.wordskeeper.data

import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    suspend fun addToWordTable(word: WordEntity): Flow<Boolean>

    suspend fun getAllWords(): Flow<List<WordEntity>>
}