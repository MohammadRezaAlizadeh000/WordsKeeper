package com.mra.wordskeeper.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WordEntity(
    @PrimaryKey val id: Int,
    val word: String,
    val description: String?
)
