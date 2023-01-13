package com.mra.wordskeeper.data

import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
): Repository {

    override suspend fun addWord(word: WordEntity): Flow<Boolean> {
        return localDataSource.addToWordTable(word)
    }

    override suspend fun getAllWords(): Flow<List<WordEntity>> {
        return localDataSource.getAllWords()
    }


}