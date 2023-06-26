package com.example.room_in_compose

import android.app.Application
import com.example.room_in_compose.data.MainDb

class App : Application() {
    val database by lazy { MainDb.createDataBase(this) }
}