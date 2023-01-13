package com.mra.wordskeeper.domin

import com.mra.wordskeeper.data.Repository
import com.mra.wordskeeper.model.WordEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface InsertWordUseCase {

    suspend operator fun invoke(wordEntity: WordEntity): Flow<Boolean>
}

class InsertWordUseCaseImpl @Inject constructor(
    private val repository: Repository
): InsertWordUseCase {

    override suspend fun invoke(wordEntity: WordEntity): Flow<Boolean> {
        return repository.addWord(wordEntity)
    }
}