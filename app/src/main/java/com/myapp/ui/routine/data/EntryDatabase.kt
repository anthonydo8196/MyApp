package com.myapp.ui.routine.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Contains database holder and is main access point for underlying connection to the app's persisted, relational data

@Database(entities = [Entry::class], version = 1, exportSchema = false)
abstract class EntryDatabase: RoomDatabase() {

    abstract fun entryDao(): EntryDao

    companion object{
        @Volatile
        private var INSTANCE: EntryDatabase? = null

        fun getDatabase(context: Context): EntryDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EntryDatabase::class.java,
                    "entry_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}