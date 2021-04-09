package com.merdanch.sozler

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word( @PrimaryKey @ColumnInfo (name = "word") val word:String)

/*
@Entity(tableName = "word_table")

class Word(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "word") val word: String
)
*/
