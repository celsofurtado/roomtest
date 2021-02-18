package com.example.roomtest2.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomtest2.model.Contato

@Database(entities = [Contato::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun ContatoDao(): ContatoDao

}