package com.mra.wordskeeper.domin

import com.mra.wordskeeper.data.Repository
import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetAllWordsUseCase {

    suspend operator fun invoke(): Flow<List<WordEntity>>

}


class GetAllWordsUseCaseImpl @Inject constructor(
    private val repository: Repository
): GetAllWordsUseCase {

    override suspend fun invoke(): Flow<List<WordEntity>> {
        return repository.getAllWords()
    }

}