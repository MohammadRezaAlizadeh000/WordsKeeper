package com.mra.wordskeeper.di

import com.mra.wordskeeper.domin.GetAllWordsUseCase
import com.mra.wordskeeper.domin.GetAllWordsUseCaseImpl
import com.mra.wordskeeper.domin.InsertWordUseCase
import com.mra.wordskeeper.domin.InsertWordUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCasesProvider {

    @Binds
    abstract fun provideGetAllWordsUseCaseImpl(impl: GetAllWordsUseCaseImpl): GetAllWordsUseCase


    @Binds
    abstract fun provideInsertWordsUseCaseImpl(impl: InsertWordUseCaseImpl): InsertWordUseCase

}