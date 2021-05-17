package com.estudo.roomwordsample

import android.app.Application
import com.estudo.roomwordsample.data.database.WordRoomDatabase
import com.estudo.roomwordsample.data.repository.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordsApplication : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}