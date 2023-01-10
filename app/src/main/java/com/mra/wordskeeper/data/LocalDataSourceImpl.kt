package com.mra.wordskeeper.data

import com.mra.wordskeeper.db.WordKeeperDb
import com.mra.wordskeeper.db.WordsKeeperDao
import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val dbDao: WordsKeeperDao
) : LocalDataSource {

    override suspend fun addToWordTable(word: WordEntity): Flow<Boolean> = flow {
        emit(dbDao.insertAll(word) > 0)
    }.flowOn(Dispatchers.IO)


    override suspend fun getAllWords(): Flow<List<WordEntity>> {
        return dbDao.getAllWord().flowOn(Dispatchers.IO)
    }

}