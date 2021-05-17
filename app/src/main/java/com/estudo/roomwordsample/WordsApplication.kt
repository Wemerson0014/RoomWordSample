package com.estudo.roomwordsample

import android.app.Application
import com.estudo.roomwordsample.data.database.WordRoomDatabase
import com.estudo.roomwordsample.data.repository.WordRepository

class WordsApplication: Application() {

    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}