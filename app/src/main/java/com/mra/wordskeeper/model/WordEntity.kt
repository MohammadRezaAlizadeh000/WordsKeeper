package com.mra.wordskeeper.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WordEntity(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    val word: String,
    val description: String?
)
