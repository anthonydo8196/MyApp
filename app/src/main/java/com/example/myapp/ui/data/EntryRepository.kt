package com.example.myapp.ui.data

import androidx.lifecycle.LiveData

// Abstracts access to multiple data sources

class EntryRepository (private val entryDao: EntryDao){

    val readAllData: LiveData<List<Entry>> = entryDao.readAllData()

    suspend fun addEntry(entry: Entry){
        entryDao.addEntry(entry)
    }
}