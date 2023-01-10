package com.mra.wordskeeper.di

import com.mra.wordskeeper.data.LocalDataSource
import com.mra.wordskeeper.data.LocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourcesProvider {

    @Binds
    abstract fun bindLocalDataSource(impl: LocalDataSourceImpl): LocalDataSource

}