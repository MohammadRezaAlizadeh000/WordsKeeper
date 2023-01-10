package com.mra.wordskeeper.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WordsKeeperDao {

    @Insert
    fun insertAll(users: WordEntity): Long

    @Query("SELECT * FROM wordentity")
    fun getAllWord(): Flow<List<WordEntity>>

}