package com.example.myapp.ui.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Represents a table within the database

@Entity(tableName = "entry_table")
data class Entry (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val enterEntry: String,
    val timeStamp: Long,

)