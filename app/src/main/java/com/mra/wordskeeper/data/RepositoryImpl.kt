package com.mra.wordskeeper.data

import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
): Repository {


}