package com.example.myapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

// Data Access Object, contains the methods used for accessing the database

@Dao
interface EntryDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addEntry(entry: Entry)

    @Query("SELECT * FROM entry_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Entry>>
}