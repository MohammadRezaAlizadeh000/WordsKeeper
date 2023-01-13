package com.mra.wordskeeper.di

import com.mra.wordskeeper.data.Repository
import com.mra.wordskeeper.data.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryProvider {

    @Binds
    abstract fun provideRepositoryImpl(impl: RepositoryImpl): Repository
}