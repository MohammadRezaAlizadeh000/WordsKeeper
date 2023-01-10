package com.mra.wordskeeper.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mra.wordskeeper.model.WordEntity

@Database(entities = [WordEntity::class], version = 1)
abstract class WordKeeperDb(): RoomDatabase() {
    abstract fun accessWordsKeeperDao(): WordsKeeperDao
}