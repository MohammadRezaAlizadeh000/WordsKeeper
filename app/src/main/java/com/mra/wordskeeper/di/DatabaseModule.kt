package com.mra.wordskeeper.di

import android.content.Context
import androidx.room.Room
import com.mra.wordskeeper.db.WordKeeperDb
import com.mra.wordskeeper.utils.DB_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        WordKeeperDb::class.java,
        DB_NAME
    ).build()


    @Singleton
    @Provides
    fun providePopularMovieDao(database: WordKeeperDb) = database.accessWordsKeeperDao()

}